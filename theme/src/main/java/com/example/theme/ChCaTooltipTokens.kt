package com.example.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

@Immutable
data class ChCaTooltipTokens(
    // Container
    val containerShape: Shape,
    val containerColor: Color,
    val contentColor: Color,
    val contentPadding: Dp,
    val elevation: Dp,
    val maxWidth: Dp,
    // Arrow
    val arrowWidth: Dp,
    val arrowHeight: Dp,
    // Motion
    val enterDurationMs: Int,
    val exitDurationMs: Int,
    val showDurationMs: Long,
)

val defaultChCaTooltipTokens = ChCaTooltipTokens(
    containerShape = ChcaPrimitiveShape.Lg,
    containerColor = ChCaPrimitiveColors.PrimaryLight,
    contentColor = ChCaPrimitiveColors.BackgroundLight,
    contentPadding = ChCaPrimitiveSpacing.Md,
    elevation = ChCaPrimitiveElevation.Low,
    maxWidth = ChCaPrimitiveSpacing.Xxl,
    arrowWidth = ChCaPrimitiveSpacing.Lg,
    arrowHeight = ChCaPrimitiveSpacing.Lg,
    enterDurationMs = 300,
    exitDurationMs = 300,
    showDurationMs = 3000L,
)

val localChCaTooltipTokens = staticCompositionLocalOf { defaultChCaTooltipTokens }