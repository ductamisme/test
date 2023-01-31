package com.example.groceryappmart.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.groceryappmart.R

val nunitoFamily = FontFamily(
    Font(R.font.nunito_bold, FontWeight.Light),
    Font(R.font.nunito_light,FontWeight.Normal),
    Font(R.font.nunito_regular,FontWeight.Bold),

    )

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = nunitoFamily
)