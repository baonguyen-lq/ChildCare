package com.example.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp

@Immutable
data class ChCaIconSizeTokens(
    val xs: Dp,
    val sm: Dp,
    val md: Dp,
    val lg: Dp,
    val xl: Dp,
    val xxl: Dp,
)

val defaultChCaIconSizeTokens = ChCaIconSizeTokens(
    xs = ChCaPrimitiveIconSize.Xs,
    sm = ChCaPrimitiveIconSize.Sm,
    md = ChCaPrimitiveIconSize.Md,
    lg = ChCaPrimitiveIconSize.Lg,
    xl = ChCaPrimitiveIconSize.Xl,
    xxl = ChCaPrimitiveIconSize.Xxl,
)

val localChCaIconSizeTokens = staticCompositionLocalOf { defaultChCaIconSizeTokens }