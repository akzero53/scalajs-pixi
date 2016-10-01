package com.github.akzero53.pixi.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("PIXI.Container")
@js.native
class Container extends DisplayObject {
  def children: js.Array[DisplayObject] = js.native
  var height: Double = js.native
  var width: Double = js.native

  def addChild(child: DisplayObject): DisplayObject = js.native
  def addChildAt(child: DisplayObject, index: Int): DisplayObject = js.native
  def getChildAt(index: Int): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Int = js.native
  def removeChild(child: DisplayObject): DisplayObject = js.native
  def removeChildAt(index: DisplayObject): DisplayObject = js.native
  def removeChildren(beginIndex: js.UndefOr[Int] = js.undefined, endIndex: js.UndefOr[Int] = js.undefined): Unit = js.native
  def setChildIndex(child: DisplayObject, index: Int): Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}
