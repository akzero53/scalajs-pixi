package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSExportAll, JSName }

@JSExportAll
case class WebGLRendererOptions(
  view: dom.html.Canvas = Pixi.DEFAULT_RENDER_OPTIONS.view,
  transparent: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.transparent,
  autoResize: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.autoResize,
  antialias: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.antialias,
  forceFXAA: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.forceFXAA,
  resolution: Int = Pixi.DEFAULT_RENDER_OPTIONS.resolution,
  clearBeforeRender: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.clearBeforeRender,
  preserveDrawingBuffer: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.preserveDrawingBuffer,
  roundPixels: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.roundPixels
)

@JSName("PIXI.WebGLRenderer")
@js.native
class WebGLRenderer(
    _width: js.UndefOr[Double] = js.undefined,
    _height: js.UndefOr[Double] = js.undefined,
    _options: js.UndefOr[WebGLRendererOptions] = js.undefined
) extends SystemRenderer("WebGL") {

  var _activeRenderTarget: RenderTarget = js.native
  var _activeShader: Shader = js.native
  var currentRenderer: ObjectRenderer = js.native
  var emptyRenderer: ObjectRenderer = js.native
  var filterManager: FilterManager = js.native
  var maskManager: MaskManager = js.native
  var state: WebGLState = js.native
  var stencilManager: StencilManager = js.native

  def bindRenderTarget(renderTarget: RenderTarget): Unit = js.native
  def bindRenderTexture(renderTexture: RenderTexture, transform: Transform): Unit = js.native
  def bindShader(shader: Shader): Unit = js.native
  def bindTexture(texture: Texture, location: Double): Unit = js.native
  def clear(clearColor: js.UndefOr[Int] = js.undefined): Unit = js.native
  override def destroy(removeView: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def flush(): Unit = js.native
  override def generateTexture(displayObject: DisplayObject, scaleMode: Int, resolution: Double): Texture = js.native
  def reset(): Unit = js.native
  override def resize(width: Double, height: Double): Unit = js.native
  def setBlendMode(blendMode: Int): Unit = js.native
  def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native
  def setTransform(matrix: Matrix): Unit = js.native
}
