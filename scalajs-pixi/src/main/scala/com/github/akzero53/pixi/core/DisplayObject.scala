package com.github.akzero53.pixi.core

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
class DisplayObject extends interaction.interactiveTarget with EventEmitter {
  var alpha: Double = js.native
  var cacheAsBitmap: Boolean = js.native
  var filterArea: Rectangle = js.native
  var filters: js.Array[js.Any] = js.native
  def localTransform: Matrix = js.native
  var mask: Graphics | Sprite = js.native
  def parent: Container = js.native
  var pivot: Point | ObservablePoint = js.native
  var position: Point | ObservablePoint = js.native
  var renderable: Boolean = js.native
  var rotation: Double = js.native
  var scale: Point | ObservablePoint = js.native
  var skew: ObservablePoint = js.native
  var transform: TransformBase = js.native
  var visible: Boolean = js.native
  def worldAlpha: Double = js.native
  def worldTransform: Matrix = js.native
  def worldVisible: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native

  def _recursivePostUpdateTransform(): Unit = js.native
  def destroy(): Unit = js.native
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def renderCanvas(renderer: CanvasRenderer): Unit = js.native
  def renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def setParent(container: Container): Container = js.native
  def setTransform(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    skewX: js.UndefOr[Double] = js.undefined,
    skewY: js.UndefOr[Double] = js.undefined,
    pivotX: js.UndefOr[Double] = js.undefined,
    pivotY: js.UndefOr[Double] = js.undefined
  ): DisplayObject = js.native
  def toGlobal(position: Point): Point = js.native
  def toLocal(position: Point, from: js.UndefOr[DisplayObject] = js.undefined, point: js.UndefOr[Point] = js.undefined): Point = js.native
}
