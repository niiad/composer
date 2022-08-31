package com.niiadotei.composer.bottomNavigation.default

import androidx.annotation.DrawableRes
import com.niiadotei.composer.R

sealed class Screen(
    val title: String,
    val route: String,
    @DrawableRes val icon: Int
) {
    object Home : Screen(
        title = "Home",
        route = "home",
        icon = R.drawable.home
    )

    object Dashboard : Screen(
        title = "Dashboard",
        route = "dashboard",
        icon = R.drawable.dashboard
    )

    object Settings : Screen(
        title = "Settings",
        route = "settings",
        icon = R.drawable.settings
    )
}
