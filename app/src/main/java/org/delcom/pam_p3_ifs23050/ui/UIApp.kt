package org.delcom.pam_p3_ifs23050.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.delcom.pam_p3_ifs23050.helper.ConstHelper
import org.delcom.pam_p3_ifs23050.ui.screens.HomeScreen
import org.delcom.pam_p3_ifs23050.ui.screens.ProfileScreen
import org.delcom.pam_p3_ifs23050.ui.screens.ZodiacDetailScreen
import org.delcom.pam_p3_ifs23050.ui.screens.ZodiacScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UIApp(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold { _ ->
        NavHost(
            navController = navController,
            startDestination = ConstHelper.RouteNames.Home.path,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF7F8FA))
        ) {
            // Home
            composable(route = ConstHelper.RouteNames.Home.path) { _ ->
                HomeScreen(navController = navController)
            }

            // Profile
            composable(route = ConstHelper.RouteNames.Profile.path) { _ ->
                ProfileScreen(navController = navController)
            }

            // Zodiac
            composable(route = ConstHelper.RouteNames.Zodiac.path) { _ ->
                ZodiacScreen(navController = navController)
            }

            // Zodiac Detail
            composable(
                route = ConstHelper.RouteNames.ZodiacDetail.path,
                arguments = listOf(
                    navArgument("name") { type = NavType.StringType },
                )
            ) { backStackEntry ->
                val zodiacName = backStackEntry.arguments?.getString("name") ?: ""
                ZodiacDetailScreen(
                    navController = navController,
                    zodiacName = zodiacName
                )
            }
        }
    }
}