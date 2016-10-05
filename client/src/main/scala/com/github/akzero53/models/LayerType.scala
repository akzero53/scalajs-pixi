package com.github.akzero53.models

sealed trait LayerType
object LayerType {
  case object BlueLayer extends LayerType
  case object RedLayer extends LayerType
  case object GreenLayer extends LayerType
}
