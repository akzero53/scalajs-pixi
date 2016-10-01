package com.github.akzero53.stores

import com.github.akzero53.models.{ EditorLayer, LayerID }
import com.github.akzero53.pixi.core.Texture

object LayerStore {
  private var layers: Seq[EditorLayer[LayerID]] = Nil

  def addLayer(id: LayerID, texture: Texture): Unit = { layers = EditorLayer(id, texture) +: layers }
  def removeLayer(id: LayerID): Unit = layers.filterNot(_.id == id)
  def updateLayer(id: LayerID, texture: Texture): Unit = {
    val head = layers.takeWhile(_.id != id)
    val tail = layers.dropWhile(_.id != id)
    val current = tail.headOption

  }
}
