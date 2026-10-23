package com.sena.actividad_03_02.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text


@Composable
fun Teams(
    onirPolitics: () -> Unit,
    onirPlayers: () -> Unit,
    onVolverHome: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = onirPolitics) {
            Text(text = "Politicas de Usuario")
        }
        Button(onClick = onirPlayers) {
            Text(text = "Jugadores")
        }
        Button(onClick = onVolverHome) {
            Text(text = "Volver")
        }
    }
    }
