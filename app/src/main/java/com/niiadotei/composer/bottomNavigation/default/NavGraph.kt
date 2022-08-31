package com.niiadotei.composer.bottomNavigation.default

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }

        composable(route = Screen.Dashboard.route) {
            DashboardScreen()
        }

        composable(route = Screen.Settings.route) {
            SettingsScreen()
        }
    }
}

// on -> onclick
// navController.popBackStack()
// navController.navigate(route = )