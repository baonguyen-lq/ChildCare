package com.example.childcare.ui.theme

import com.example.theme.ChCaPrimitiveColors
import com.example.theme.defaultChCaCard
import com.example.theme.defaultChCaTooltipTokens
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ThemeTest {

    @Test
    fun defaultCardTokens_areNotNull() {
        val cardTokens = defaultChCaCard
        assertNotNull(cardTokens)
        assertEquals(ChCaPrimitiveColors.BackgroundLight, cardTokens.containerColor)
    }

    @Test
    fun defaultTooltipTokens_areNotNull() {
        val tooltipTokens = defaultChCaTooltipTokens
        assertNotNull(tooltipTokens)
        assertEquals(3000L, tooltipTokens.showDurationMs)
    }
}
