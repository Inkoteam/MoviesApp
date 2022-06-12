package com.inkoteam.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.inkoteam.moviesapp.MainViewModel
import com.inkoteam.moviesapp.screens.MainScreen
import com.inkoteam.moviesapp.screens.SplashScreen
import com.inkoteam.moviesapp.utils.Constants

/* Элементы экрана */
sealed class Screens (val route: String){
    object Splash: Screens(route = Constants.Screens.SPLASH_SCREEN)
    object Main: Screens(route = Constants.Screens.MAIN_SCREEN)
    object Details: Screens(route = Constants.Screens.DETAILS_SCREEN)
}
/* Пока не понятно что мы делаем */
@Composable
fun SetupNavHost (navController: NavHostController, viewModel: MainViewModel){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route // первый экран который загрузится
    ){
        composable(route = Screens.Splash.route){
            SplashScreen(navController = navController, viewModel= viewModel)
        }
        composable(route = Screens.Main.route){
            MainScreen(navController = navController, viewModel= viewModel)
        }
        composable(route = Screens.Details.route){

        }
    }
}