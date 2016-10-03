package com.github.akzero53

import com.github.akzero53.components.ReactDrawingTool
import japgolly.scalajs.react.ReactDOM
import org.scalajs.dom

import scala.scalajs.js

@scala.scalajs.js.annotation.JSExport
object Main extends js.JSApp {
  @scala.scalajs.js.annotation.JSExport
  override def main(): Unit = {
    val tRootDomNode = dom.document.getElementById("root")
    ReactDOM.render(ReactDrawingTool(ReactDrawingTool.Props(margin = 30)), tRootDomNode)
  }
}
