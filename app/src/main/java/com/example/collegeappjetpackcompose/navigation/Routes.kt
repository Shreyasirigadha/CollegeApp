package com.example.collegeappjetpackcompose.navigation

sealed class Routes(val route:String) {

    object Home: Routes("home")
    object Faculty: Routes("faculty")
    object Gallery: Routes("gallery")
    object AboutUs: Routes("about")
    object BottomNav: Routes("bottom")
}