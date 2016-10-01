package com.github.akzero53.pixi.core

import scala.scalajs.js

@js.native
trait Renderable extends js.Object {
  def render(
    displayObject: DisplayObject,
    renderTexture: js.UndefOr[RenderTexture] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    transform: js.UndefOr[Transform] = js.undefined,
    skipUpdateTransform: js.UndefOr[Boolean] = js.undefined
  ): Unit = js.native
}
