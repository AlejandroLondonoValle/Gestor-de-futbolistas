package com.sena.actividad_03_02.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sena.actividad_03_02.ui.screen.Home
import com.sena.actividad_03_02.ui.screen.Politics
import com.sena.actividad_03_02.ui.screen.Teams
import com.sena.actividad_03_02.ui.screen.Players
import com.sena.actividad_03_02.ui.screen.PlayerDetail



@Composable
fun AppNavegation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Home
    ){

        composable<Home>{
            Home(
                onirPolitics = {navController.navigate(Politics)},
                onirTeams = {navController.navigate(Teams)}
            )
        }

        composable<Politics>{
            Politics(
                onVolverHome = {navController.popBackStack()}
        }

        composable<Teams>{
            onirPolitics = {navController.navigate(Politics)}
            onirPlayers = {navController.navigate(Players)}
            onVolverHome = {navController.popBackStack()}
        }

        composable<Players>{
            onirPolitics = {navController.navigate(Politics)}
            onirTeams = {navController.navigate(Teams)}
            onVolverHome = {navController.popBackStack()}
        }

        composable<PlayerDetail>{
            onVolverHome = {navController.popBackStack()}
            dato -> PlayerDetail(
                id = dato.arguments?.getInt("id") ?: 0,
                name = dato.arguments?.getString("name") ?: "",
                position = dato.arguments?.getString("position") ?: "",
                nationality = dato.arguments?.getString("nationality") ?: "",
                age = dato.arguments?.getInt("age") ?: 0,
                number = dato.arguments?.getInt("number") ?: 0)
        }



    }
    }
