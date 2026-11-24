package com.example.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp

@Immutable
data class ChCaBorderTokens(
    val none: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
)

val defaultChCaBorderTokens = ChCaBorderTokens(
    none = ChCaPrimitiveBorder.none,
    small = ChCaPrimitiveBorder.small,
    medium = ChCaPrimitiveBorder.medium,
    large = ChCaPrimitiveBorder.large
)

val localChCaBorderTokens = staticCompositionLocalOf { defaultChCaBorderTokens }