package com.github.akzero53

import com.github.akzero53.pixi.core._
import org.scalajs.dom

import scala.scalajs.js

@scala.scalajs.js.annotation.JSExport
object Main extends js.JSApp {
  private var token: Option[Int] = None
  private val margin: Int = 30

  @scala.scalajs.js.annotation.JSExport
  override def main(): Unit = {
    val tRenderer = Pixi.autoDetectRenderer()
    dom.document.body.appendChild(tRenderer.view)

    val tPixiV4Sprite = new Sprite(Texture.fromImage("http://www.goodboydigital.com/wp-content/uploads/2016/04/v4Wide.jpg"))
    tPixiV4Sprite.x = margin
    tPixiV4Sprite.y = margin
    val tContainer = new Container
    tContainer.addChild(tPixiV4Sprite)

    lazy val animate: () => Unit = () => {
      token = Some(Animation.requestAnimationFrame(animate))
      tRenderer.resize(margin * 2 + tPixiV4Sprite.width, margin * 2 + tPixiV4Sprite.height)
      if (tPixiV4Sprite.x > margin * 2 + tPixiV4Sprite.width) {
        tPixiV4Sprite.x = -tPixiV4Sprite.width
      }
      if (tPixiV4Sprite.y > margin * 2 + tPixiV4Sprite.height) {
        tPixiV4Sprite.y = -tPixiV4Sprite.height
      }
      tPixiV4Sprite.x += 1
      tPixiV4Sprite.y += 3
      tRenderer.render(tContainer)
    }

    Animation.requestAnimationFrame(animate)
  }
}
