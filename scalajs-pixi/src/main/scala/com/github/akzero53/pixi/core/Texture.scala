package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
class Texture extends EventEmitter {
  var _frame: Rectangle = js.native
  var baseTexture: BaseTexture = js.native
  var frame: Rectangle = js.native
  var noFrame: Boolean = js.native
  var orig: Rectangle = js.native
  var requiresUpdate: Boolean = js.native
  var trim: Rectangle = js.native
  var valid: Boolean = js.native

  protected def _updateUvs(): Unit = js.native
  override def clone(): Texture = js.native
  def destroy(destroyBase: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def update(): Unit = js.native
}

@js.native
object Texture extends js.Object {
  val EMPTY: BaseTexture = js.native

  def addTextureToCache(texture: Texture, id: String): Unit = js.native
  def from(source: Int | String | BaseTexture | dom.html.Canvas | dom.html.Video): Texture = js.native
  def fromCanvas(canvas: dom.html.Canvas, scaleMode: Int): Texture = js.native
  def fromFrame(frameId: Int): Texture = js.native
  def fromImage(imageUrl: String, crossorigin: js.UndefOr[Boolean] = js.undefined, scaleMode: js.UndefOr[Int] = js.undefined): Texture = js.native
  def fromVideo(video: dom.html.Video, scaleMode: js.UndefOr[Int] = js.undefined): Texture = js.native
  def fromVideoUrl(videoUrl: String, scaleMode: js.UndefOr[Int] = js.undefined): Texture = js.native
  def removeTextureFromCache(id: String): Texture = js.native
}