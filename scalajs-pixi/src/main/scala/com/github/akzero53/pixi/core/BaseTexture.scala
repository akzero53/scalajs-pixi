package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("PIXI.BaseTexture")
@js.native
class BaseTexture extends EventEmitter {
  def hasLoaded: Boolean = js.native
  def height: Double = js.native
  var imageUrl: String = js.native
  def isLoading: Boolean = js.native
  var mipmap: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native
  def realHeight: Double = js.native
  def realWidth: Double = js.native
  var resolution: Double = js.native
  var scaleMode: Int = js.native
  def source: dom.html.Image | dom.html.Canvas = js.native
  def width: Double = js.native
  def wrapMode: Int = js.native

  def fromCanvas(canvas: dom.html.Canvas, scaleMode: Int): BaseTexture = js.native
  def fromImage(imageUrl: String, crossorigin: js.UndefOr[Boolean] = js.undefined, scaleMode: js.UndefOr[Int] = js.undefined): BaseTexture = js.native
  def destroy(): Unit = js.native
  def dispose(): Unit = js.native
  protected def loadSource(source: dom.html.Image | dom.html.Canvas): Unit = js.native
  def update(): Unit = js.native
  def updateSourceImage(newSrc: String): Unit = js.native
}
