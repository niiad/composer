package com.niiadotei.composer.onBoarding.plain

import androidx.annotation.DrawableRes
import com.niiadotei.composer.R

// In presentation layer - util

sealed class OnBoardingData(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {


    object First : OnBoardingData(
        image = R.drawable.first,
        title = "First Title",
        description = "First description of the first on boarding data"
    )

    object Second : OnBoardingData(
        image = R.drawable.second,
        title = "Second Title",
        description = "Second description of the second on boarding data"
    )

    object Third : OnBoardingData(
        image = R.drawable.third,
        title = "Third Title",
        description = "Third description of the third on boarding data."
    )
}
