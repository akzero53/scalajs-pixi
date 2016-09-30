package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
case class CanvasRendererOptions(
  view: dom.html.Canvas = Pixi.DEFAULT_RENDER_OPTIONS.view,
  transparent: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.transparent,
  autoResize: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.autoResize,
  antialias: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.antialias,
  resolution: Int = Pixi.DEFAULT_RENDER_OPTIONS.resolution,
  clearBeforeRender: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.clearBeforeRender,
  roundPixels: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.roundPixels
)

@js.native
class CanvasRenderer(
    _width: js.UndefOr[Double] = js.undefined,
    _height: js.UndefOr[Double] = js.undefined,
    options: js.UndefOr[CanvasRendererOptions] = js.undefined
) extends SystemRenderer("Canvas") {
  var maskManager: CanvasMaskManager = js.native
  var refresh: Boolean = js.native
  var rootContext: dom.CanvasRenderingContext2D = js.native
  var smoothProperty: String = js.native

  override def destroy(removeView: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  override def generateTexture(displayObject: DisplayObject, scaleMode: Int, resolution: Double): Texture = js.native
  override def resize(width: Double, height: Double): Unit = js.native
}
