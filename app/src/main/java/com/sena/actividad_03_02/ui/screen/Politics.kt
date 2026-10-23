package com.sena.actividad_03_02.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sena.actividad_03_02.navegation.Politics

@Composable
fun Politics(
    onVolverHome: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Politicas de Usuario")

        Button(onClick = onVolverHome) {
            Text(text = "Volver")
        }
    }
}
