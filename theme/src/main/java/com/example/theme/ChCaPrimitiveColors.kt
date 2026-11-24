package com.example.theme

import androidx.compose.ui.graphics.Color

object ChCaPrimitiveColors {
    val SageGreen = Color(0xFF526E60)     // Dùng làm màu Primary (chính)
    val Terracotta = Color(0xFFD4856D)    // Dùng làm màu Secondary / Accent (nhấn)
    val Cream = Color(0xFFF7F5EC)         // Dùng làm màu Background ấm áp
    val TextCharcoal = Color(0xFF2B3731)  // Màu chữ tối cho các tiêu đề (Headings)

    // Light Mode Mapping
    val PrimaryLight = SageGreen
    val BackgroundLight = Cream
    val SurfaceLight = Color(0xFFFFFFFF)  // Màu nền trắng cho Card/Surface nổi lên trên nền Cream
    val OnPrimaryLight = Color(0xFFFFFFFF)// Chữ trên nút Sage Green (màu trắng)
    val OnBackgroundLight = TextCharcoal
    val Green = Color(0xFF526E60)
    val Red = Color(0xFFD4856D)
    val Grey = Color(0xFFF7F5EC)

    //  Dark Mode Mapping
// (Chuyển đổi tone màu trầm ấm để dịu mắt vào ban đêm)
    val PrimaryDark = Color(0xFF8FA89B)   // Sage Green sáng hơn một chút để nổi trên nền tối
    val BackgroundDark = Color(0xFF121413)// Đen xám đậm chủ đạo
    val SurfaceDark = Color(0xFF1A1D1C)   // Màu surface cho các thẻ Card ở chế độ tối
    val OnPrimaryDark = Color(0xFF121413) // Chữ hiển thị trên nút Primary ở Dark Mode
    val OnBackgroundDark = Cream          // Chữ sáng (Cream) hiển thị trên nền tối
}