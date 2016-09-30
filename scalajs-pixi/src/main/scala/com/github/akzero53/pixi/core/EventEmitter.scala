package com.github.akzero53.pixi.core

import scala.scalajs.js

@js.native
trait EventEmitter extends js.Object {
  def eventNames: Seq[String] = js.native
  def listeners(event: js.UndefOr[String] = js.undefined): Seq[js.Function] = js.native
  def listeners(event: String, exists: Boolean): Boolean = js.native
  def emit(
    event: String,
    a1: js.UndefOr[js.Any] = js.undefined,
    a2: js.UndefOr[js.Any] = js.undefined,
    a3: js.UndefOr[js.Any] = js.undefined,
    a4: js.UndefOr[js.Any] = js.undefined,
    a5: js.UndefOr[js.Any] = js.undefined
  ): Boolean = js.native
  def on(event: String, fn: js.Function, context: js.UndefOr[js.Any] = js.undefined): Unit = js.native
  def once(event: String, fn: js.Function, context: js.UndefOr[js.Any] = js.undefined): Unit = js.native
  def removeListener(event: String, fn: js.Function, context: js.UndefOr[js.Any] = js.undefined, once: js.UndefOr[js.Any] = js.undefined): Unit = js.native
  def removeAllListeners(event: js.UndefOr[String] = js.undefined): Unit = js.native
  def off(event: String, fn: js.Function, context: js.UndefOr[js.Any] = js.undefined, once: js.UndefOr[js.Any] = js.undefined): Unit = js.native
  def addListener(event: String, fn: js.Function, context: js.UndefOr[js.Any] = js.undefined): Unit = js.native
}
