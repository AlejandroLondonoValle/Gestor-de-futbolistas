package com.sena.actividad_03_02.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.sena.actividad_03_02.ui.screen.Home
import com.sena.actividad_03_02.ui.screen.Politics
import com.sena.actividad_03_02.ui.screen.Teams
import com.sena.actividad_03_02.ui.screen.Players
import com.sena.actividad_03_02.ui.screen.PlayerDetail
import androidx.compose.ui.Modifier



@Composable
fun AppNavegation(
    modifier: Modifier = Modifier
){
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
            )
        }

        composable<Teams>{
            Teams(
                onirPolitics = {navController.navigate(Politics)},
                onirPlayers = {navController.navigate(Players)},
                onVolverHome = {navController.popBackStack()}
            )
        }

        composable<Players>{
            Players(
                onirPolitics = {navController.navigate(Politics)},
                onirPlayerDetails = {navController.navigate(PlayerDetail(
                    id = 1,
                    name = "René Higuita",
                    position = "Arquero",
                    nationality = "Colombiano",
                    age = 40,
                    number = 1
                ))},
                onVolverHome = {navController.popBackStack()}
            )
        }

        composable<PlayerDetail>{ backStackEntry ->
            val args = backStackEntry.toRoute<PlayerDetail>()
            PlayerDetail(
                id = args.id,
                name = args.name,
                position = args.position,
                nationality = args.nationality,
                age = args.age,
                number = args.number,
                onVolverHome = {navController.popBackStack()}
            )





        }



    }
    }
