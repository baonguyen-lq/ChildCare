package com.example.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class ChCaTypographyTokens(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val caption: TextStyle,
)

@Composable
fun defaultChCaTypography(
    fontFamily: FontFamily = FontFamily.SansSerif,
): ChCaTypographyTokens = ChCaTypographyTokens(
    h1 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Bold, fontSize = 48.sp),
    h2 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Bold, fontSize = 32.sp),
    h3 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Bold, fontSize = 24.sp),
    bodySmall = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 14.sp),
    bodyMedium = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp),
    caption = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 12.sp),
)

val defaultChCaTypography = ChCaTypographyTokens(
    h1 = TextStyle(fontWeight = FontWeight.Bold, fontSize = 48.sp),
    h2 = TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp),
    h3 = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp),
    bodySmall = TextStyle(fontWeight = FontWeight.Normal, fontSize = 14.sp),
    bodyMedium = TextStyle(fontWeight = FontWeight.Normal, fontSize = 16.sp),
    caption = TextStyle(fontWeight = FontWeight.Normal, fontSize = 12.sp),
)

val localChCaTypographyTokens = staticCompositionLocalOf { defaultChCaTypography }
