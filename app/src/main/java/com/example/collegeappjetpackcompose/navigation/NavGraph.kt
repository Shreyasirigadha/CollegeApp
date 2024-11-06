package com.example.collegeappjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController ,
        startDestination
    )
}