package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.typedarray.Float32Array
import scala.scalajs.js.|

@JSName("PIXI.Sprite")
@js.native
class Sprite(_texture: Texture) extends Container {
  var _tint: Int = js.native
  var anchor: ObservablePoint = js.native
  var blendMode: Int = js.native
  var shader: Shader = js.native
  var texture: Texture = js.native
  var vertexData: Float32Array = js.native
  var vertexTrimmedData: Float32Array = js.native

  def calculateTrimmedVertices(): Unit = js.native
  def calculateVertices(): Unit = js.native
  def containsPoint(point: Point): Boolean = js.native
  def getLocalBounds(): Rectangle = js.native
}

@JSName("PIXI.Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: Int | String | BaseTexture | dom.html.Canvas | dom.html.Video): Texture = js.native
  def fromFrame(frameId: String): Sprite = js.native
  def fromImage(imageId: String, crossorigin: js.UndefOr[Boolean] = js.undefined, scaleMode: js.UndefOr[Int] = js.undefined): Unit = js.native
}