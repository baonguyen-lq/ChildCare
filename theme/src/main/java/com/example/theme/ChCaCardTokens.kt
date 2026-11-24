package com.example.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class ChCaCardTokens(
    val containerShape: Shape,
    val containerColor: Color,
    val contentPadding: Dp,
    val elevation: Dp,
    val borderWidth: Dp,
    val borderColor: Color,
    val itemShape: Shape,
    val itemColor: Color,
    val itemBorderColor: Color,
)

val defaultChCaCard = ChCaCardTokens(
    containerShape = ChcaPrimitiveShape.Lg,
    containerColor = ChCaPrimitiveColors.BackgroundLight,
    contentPadding = ChCaPrimitiveSpacing.Sm2,
    elevation = ChCaPrimitiveElevation.None,
    borderWidth = ChCaPrimitiveSpacing.Xxxs,
    borderColor = ChCaPrimitiveColors.SurfaceLight,
    itemShape = ChcaPrimitiveShape.Sm,
    itemColor = ChCaPrimitiveColors.PrimaryLight,
    itemBorderColor = ChCaPrimitiveColors.SurfaceLight
)

val LocalChCaCard = staticCompositionLocalOf { defaultChCaCard }