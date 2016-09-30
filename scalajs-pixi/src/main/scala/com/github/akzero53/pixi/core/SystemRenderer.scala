package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js

case class SystemRendererOptions(
  view: dom.html.Canvas = Pixi.DEFAULT_RENDER_OPTIONS.view,
  transparent: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.transparent,
  autoResize: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.autoResize,
  antialias: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.antialias,
  resolution: Int = Pixi.DEFAULT_RENDER_OPTIONS.resolution,
  clearBeforeRender: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.clearBeforeRender,
  backgroundColor: Int = Pixi.DEFAULT_RENDER_OPTIONS.backgroundColor,
  roundPixels: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.roundPixels
)

@js.native
class SystemRenderer(
    system: String,
    _width: js.UndefOr[Double] = js.undefined,
    _height: js.UndefOr[Double] = js.undefined,
    options: js.UndefOr[SystemRendererOptions] = js.undefined
) extends Renderable {
  var autoResize: Boolean = js.native
  var backgroundColor: Int = js.native
  var blendModes: Int = js.native
  var clearBeforeRender: Boolean = js.native
  var height: Double = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var resolution: Double = js.native
  var roundPixels: Boolean = js.native
  var transparent: Boolean = js.native
  var `type`: Int = js.native
  var view: dom.html.Canvas = js.native
  var width: Double = js.native

  def destroy(removeView: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: Int, resolution: Double): Texture = js.native
  def resize(width: Double, height: Double): Unit = js.native
}
