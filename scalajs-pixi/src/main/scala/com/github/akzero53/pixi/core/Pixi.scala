package com.github.akzero53.pixi.core

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSExportAll, JSName }
import scala.scalajs.js.|

@JSExportAll
case class AutoDetectRendererOptions(
  view: dom.html.Canvas = Pixi.DEFAULT_RENDER_OPTIONS.view,
  transparent: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.transparent,
  antialias: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.antialias,
  preserveDrawingBuffer: Boolean = Pixi.DEFAULT_RENDER_OPTIONS.preserveDrawingBuffer,
  resolution: Int = Pixi.DEFAULT_RENDER_OPTIONS.resolution
)

@js.native
@JSName("PIXI")
object Pixi extends js.Object {

  @js.native
  object BLEND_MODES extends js.Object {
    val NORMAL: Int = js.native
    val ADD: Int = js.native
    val MULTIPLY: Int = js.native
    val SCREEN: Int = js.native
    val OVERLAY: Int = js.native
    val DARKEN: Int = js.native
    val LIGHTEN: Int = js.native
    val COLOR_DODGE: Int = js.native
    val COLOR_BURN: Int = js.native
    val HARD_LIGHT: Int = js.native
    val SOFT_LIGHT: Int = js.native
    val DIFFERENCE: Int = js.native
    val EXCLUSION: Int = js.native
    val HUE: Int = js.native
    val SATURATION: Int = js.native
    val COLOR: Int = js.native
    val LUMINOSITY: Int = js.native
  }

  @js.native
  object DEFAULT_RENDER_OPTIONS extends js.Object {
    val view: dom.html.Canvas = js.native
    val resolution: Int = js.native
    val antialias: Boolean = js.native
    val forceFXAA: Boolean = js.native
    val autoResize: Boolean = js.native
    val transparent: Boolean = js.native
    val backgroundColor: Boolean = js.native
    val clearBeforeRender: Boolean = js.native
    val preserveDrawingBuffer: Boolean = js.native
    val roundPixels: Boolean = js.native
  }

  val DEG_TO_RAD: Double = js.native

  @js.native
  object DRAW_MODES extends js.Object {
    val POINTS: Int = js.native
    val LINES: Int = js.native
    val LINE_LOOP: Int = js.native
    val LINE_STRIP: Int = js.native
    val TRIANGLES: Int = js.native
    val TRIANGLE_STRIP: Int = js.native
    val TRIANGLE_FAN: Int = js.native
  }

  val FILTER_RESOLUTION: Int = js.native

  @js.native
  object GC_MODES extends js.Object {
    val DEFAULT: Int = js.native
    val AUTO: Int = js.native
    val MANUAL: Int = js.native
  }

  val loader: loaders.Loader = js.native

  val MIPMAP_TEXTURES: Boolean = js.native

  val PI_2: Double = js.native

  @js.native
  object PRECISION extends js.Object {
    val DEFAULT: Int = js.native
    val LOW: Int = js.native
    val MEDIUM: Int = js.native
    val HIGH: Int = js.native
  }

  val RAD_TO_DEG: Double = js.native

  @js.native
  object RENDERER_TYPE extends js.Object {
    val UNKNOWN: Int = js.native
    val WEBGL: Int = js.native
    val CANVAS: Int = js.native
  }

  val RESOLUTION: Double = js.native

  val RETINA_PREFIXRegExp: String = js.native

  @js.native
  object SCALE_MODES extends js.Object {
    val DEFAULT: Int = js.native
    val LINEAR: Int = js.native
    val NEAREST: Int = js.native
  }

  @js.native
  object SHAPES extends js.Object {
    val POLY: Int = js.native
    val RECT: Int = js.native
    val CIRC: Int = js.native
    val ELIP: Int = js.native
    val RREC: Int = js.native
  }

  val SPRITE_BATCH_SIZE: Int = js.native

  val SPRITE_MAX_TEXTURES: Int = js.native

  val TARGET_FPMS: Int = js.native

  @js.native
  object TEXT_GRADIENT extends js.Object {
    val LINEAR_VERTICAL: Int = js.native
    val LINEAR_HORIZONTAL: Int = js.native
  }

  @js.native
  object TRANSFORM_MODE extends js.Object {
    val DEFAULT: Int = js.native
    val STATIC: Int = js.native
    val DYNAMIC: Int = js.native
  }

  val VERSION: String = js.native

  @js.native
  object WRAP_MODES extends js.Object {
    val DEFAULT: Double = js.native
    val CLAMP: Double = js.native
    val REPEAT: Double = js.native
  }

  def autoDetectRenderer(width: Double, height: Double, options: js.UndefOr[AutoDetectRendererOptions], noWebGL: js.UndefOr[Boolean]): WebGLRenderer | CanvasRenderer = js.native
}
