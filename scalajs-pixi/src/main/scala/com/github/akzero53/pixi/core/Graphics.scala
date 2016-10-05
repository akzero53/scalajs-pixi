package com.github.akzero53.pixi.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("PIXI.Graphics")
@js.native
class Graphics extends Container {
  var blendMode: Int = js.native
  var boundsDirty: Int = js.native
  var boundsPadding: Double = js.native
  var clearDirty: Int = js.native
  var fastRectDirty: Int = js.native
  var fillAlpha: Int = js.native
  var isMask: Boolean = js.native
  var lineColor: String = js.native
  var lineWidth: Int = js.native
  var tint: Int = js.native

  def _calculateBounds(matrix: Matrix): Rectangle = js.native
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginFill(color: Int, alpha: Double): Graphics = js.native
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  def clear(): Graphics = js.native
  def containsPoint(point: Point): Boolean = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawPolygon(path: js.Array[Double] | js.Array[Point]): Graphics = js.native
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def drawShape(shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): GraphicsData = js.native
  def endFill(): Graphics = js.native
  def isFastRect(): Boolean = js.native
  def lineStyle(lineWidth: Int, color: Int, alpha: Double): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
  def updateLocalBounds(): Unit = js.native
}
