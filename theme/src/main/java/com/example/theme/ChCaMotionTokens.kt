package com.example.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

@Immutable
data class ChCaMotionTokens(
    // Container
    val containerShape: Shape,
    val containerColor: Color,
    val contentColor: Color,
    val actionColor: Color,
    val contentPadding: Dp,
    // Variant colors
    val successContainerColor: Color,
    val successContentColor: Color,
    val errorContainerColor: Color,
    val errorContentColor: Color,
    val warningContainerColor: Color,
    val warningContentColor: Color,
    val infoContainerColor: Color,
    val infoContentColor: Color,
    // Icon
    val iconSize: Dp,
    val iconPadding: Dp,
    // Motion
    val enterDurationMs: Int,
    val exitDurationMs: Int,
    val autoDismissDurationMs: Long,
)

val defaultChCaMotion = ChCaMotionTokens(
    containerShape = ChcaPrimitiveShape.Xxxl,
    containerColor = ChCaPrimitiveColors.PrimaryLight,
    contentColor = ChCaPrimitiveColors.BackgroundLight,
    actionColor = ChCaPrimitiveColors.BackgroundLight,
    contentPadding = ChCaPrimitiveSpacing.Md,
    successContainerColor = ChCaPrimitiveColors.Green,
    successContentColor = ChCaPrimitiveColors.BackgroundLight,
    errorContainerColor = ChCaPrimitiveColors.Red,
    errorContentColor = ChCaPrimitiveColors.BackgroundLight,
    warningContainerColor = ChCaPrimitiveColors.Grey,
    warningContentColor = ChCaPrimitiveColors.Cream,
    infoContainerColor = ChCaPrimitiveColors.BackgroundLight,
    infoContentColor = ChCaPrimitiveColors.Grey,
    iconSize = ChCaPrimitiveSpacing.Lg,
    iconPadding = ChCaPrimitiveSpacing.Md,
    enterDurationMs = 150,
    exitDurationMs = 150,
    autoDismissDurationMs = 5000L,
)

val localChCaMotion = staticCompositionLocalOf { defaultChCaMotion }