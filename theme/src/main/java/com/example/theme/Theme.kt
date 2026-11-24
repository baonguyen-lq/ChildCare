package com.example.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun ChCaTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val typography = defaultChCaTypography()

    CompositionLocalProvider(
        localChCaBorderTokens provides defaultChCaBorderTokens,
        localChCaBottomSheetTokens provides defaultChCaBottomSheetTokens,
        LocalChCaCard provides defaultChCaCard,
        localChCaIconSizeTokens provides defaultChCaIconSizeTokens,
        localChCaMotion provides defaultChCaMotion,
        localChCaOpacityTokens provides defaultChCaOpacityTokens,
        localChCaSnackbar provides defaultChCaSnackbar,
        localChCaTooltipTokens provides defaultChCaTooltipTokens,
        localChCaTypographyTokens provides typography,
        content = content,
    )
}

object ChCaTheme {
    val border: ChCaBorderTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaBorderTokens.current

    val bottomSheet: ChCaBottomSheetTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaBottomSheetTokens.current

    val card: ChCaCardTokens
        @Composable
        @ReadOnlyComposable
        get() = LocalChCaCard.current

    val iconSize: ChCaIconSizeTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaIconSizeTokens.current

    val motion: ChCaMotionTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaMotion.current

    val opacity: ChCaOpacityTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaOpacityTokens.current

    val snackbar: ChCaSnackBarTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaSnackbar.current

    val tooltip: ChCaTooltipTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaTooltipTokens.current

    val typography: ChCaTypographyTokens
        @Composable
        @ReadOnlyComposable
        get() = localChCaTypographyTokens.current
}
