package com.example.ui_components.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theme.SurfaceLight

@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    contentDescription: String = "",
    onClick: () -> Unit = {},
) {
    Box(
        modifier
            .size(width = 300.dp, height = 200.dp)
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(color = SurfaceLight)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .padding(2.dp)
    )
}

@Preview
@Composable
fun AppButtonPreview() {
    AppButton(modifier = Modifier, contentDescription = "Button", onClick = {})
}
