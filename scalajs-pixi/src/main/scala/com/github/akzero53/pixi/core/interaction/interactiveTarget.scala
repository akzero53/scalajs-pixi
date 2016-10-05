package com.github.akzero53.pixi.core.interaction

import com.github.akzero53.pixi.core._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait interactiveTarget extends js.Object {
  var buttonMode: Boolean = js.native
  var defaultCursor: String = js.native
  var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle = js.native
  var interactive: Boolean = js.native
  var interactiveChildren: Boolean = js.native
}
