package com.example.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf

@Immutable
data class ChCaOpacityTokens(
    val disabled: Float,
    val scrim: Float,
    val hover: Float,
    val pressed: Float,
    val dragged: Float,
)

val defaultChCaOpacityTokens = ChCaOpacityTokens(
    disabled = 0.38f,
    scrim = 0.4f,
    hover = 0.04f,
    pressed = 0.12f,
    dragged = 0.08f,
)


val localChCaOpacityTokens = staticCompositionLocalOf { defaultChCaOpacityTokens }




