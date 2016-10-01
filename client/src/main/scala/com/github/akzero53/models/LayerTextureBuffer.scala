package com.github.akzero53.models

import com.github.akzero53.pixi.core.Texture

case class LayerTextureBuffer[ID](id: ID, textures: Seq[Texture])
