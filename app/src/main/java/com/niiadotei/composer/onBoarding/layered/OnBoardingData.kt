package com.niiadotei.composer.onBoarding.layered

import androidx.compose.ui.graphics.Color

data class OnBoardingData(
    val image: Int,
    val backgroundColor: Color = Color(0xFF24574E),
    val mainColor: Color,
    val header: String,
    val message: String
)