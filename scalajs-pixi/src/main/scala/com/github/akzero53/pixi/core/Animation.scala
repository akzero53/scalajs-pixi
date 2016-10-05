package com.github.akzero53.pixi.core

import scala.scalajs.js

@js.native
object Animation extends js.GlobalScope {
  def requestAnimationFrame(callback: js.Function): Int = js.native
  def cancelAnimationFrame(id: Int): Unit = js.native
}
