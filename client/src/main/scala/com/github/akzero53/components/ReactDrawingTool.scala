package com.github.akzero53.components

import com.github.akzero53.pixi.core._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import org.scalajs.dom

object ReactDrawingTool {
  private val viewId = "HomePageCanvasView"

  case class Props(margin: Int)
  case class State(token: Option[Int], animating: Boolean)
  class Backend($: BackendScope[Props, State]) {
    private val renderer = Pixi.autoDetectRenderer()
    private val container = new Container
    private val texture = Texture.fromImage("http://www.goodboydigital.com/wp-content/uploads/2016/04/v4Wide.jpg")
    texture.once("update", () => resize.runNow())
    private val pixiV4Sprite = new Sprite(texture)

    lazy val animate: () => Unit = () => {
      ($.modState(_.copy(token = Some(Animation.requestAnimationFrame(animate)))) >> $.props >>= { (props: Props) =>
        Callback {
          val margin = props.margin
          renderer.resize(margin * 2 + pixiV4Sprite.width, margin * 2 + pixiV4Sprite.height)
          if (pixiV4Sprite.x > margin * 2 + pixiV4Sprite.width) {
            pixiV4Sprite.x = -pixiV4Sprite.width
          }
          if (pixiV4Sprite.y > margin * 2 + pixiV4Sprite.height) {
            pixiV4Sprite.y = -pixiV4Sprite.height
          }
          pixiV4Sprite.x += 1
          pixiV4Sprite.y += 3
          renderer.render(container)
        }
      }).runNow()
    }

    def refreshViewDom: Callback = Callback {
      val viewDom = dom.document.getElementById(viewId) // TODO: more good ways else?
      if (!viewDom.hasChildNodes()) viewDom.appendChild(renderer.view)
    }

    def resize: Callback = $.props >>= ((props: Props) => Callback {
      val margin2x = props.margin * 2
      renderer.resize(margin2x + pixiV4Sprite.width, margin2x + pixiV4Sprite.height)
    })

    def animationStart: Callback = $.modState(_.copy(token = Some(Animation.requestAnimationFrame(animate)), animating = true))

    def animationStop: Callback = ($.state >>= ((state: State) => Callback { state.token.foreach(i => Animation.cancelAnimationFrame(i)) })) >>
      $.modState(_.copy(token = None, animating = false))

    def toggleAnimating: Callback = $.state >>= ((state: State) => if (state.animating) animationStop else animationStart)

    def init: Callback = refreshViewDom >> update

    def deinit: Callback = animationStop

    def update: Callback = refreshViewDom >> Callback {
      container.removeChildren()
      container.addChild(pixiV4Sprite)
    }
  }

  private val component = ReactComponentB[Props]("HomePage")
    .initialState(State(token = None, animating = false))
    .backend(new Backend(_))
    .renderPS { ($, props, state) =>
      <.div(
        <.div(^.id := viewId),
        <.button("start/stop", ^.onClick --> $.backend.toggleAnimating)
      )
    }
    .componentDidMount(_.backend.init)
    .componentWillUnmount(_.backend.deinit)
    .build

  def apply(props: Props) = component(props)
}
