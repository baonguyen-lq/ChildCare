package com.example.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class ChCaBottomSheetTokens(
    val containerShape: Shape,
    val containerColor: Color,
    val dragHandleWidth: Dp,
    val dragHandleHeight: Dp,
    val dragHandleColor: Color,
    val contentPadding: Dp,
    val scrimColor: Color,
)

val defaultChCaBottomSheetTokens = ChCaBottomSheetTokens(
    containerShape = RoundedCornerShape(
        topStart = ChCaPrimitiveSpacing.Md,
        topEnd = ChCaPrimitiveSpacing.Md,
        bottomEnd = 0.dp,
        bottomStart = 0.dp),
    containerColor = ChCaPrimitiveColors.BackgroundLight,
    dragHandleWidth = ChCaPrimitiveSpacing.Lg,
    dragHandleHeight = ChCaPrimitiveSpacing.Lg,
    dragHandleColor = ChCaPrimitiveColors.Cream,
    contentPadding = ChCaPrimitiveSpacing.Md,
    scrimColor = ChCaPrimitiveColors.PrimaryLight.copy(alpha = 0.5f)
)

val localChCaBottomSheetTokens = staticCompositionLocalOf { defaultChCaBottomSheetTokens }