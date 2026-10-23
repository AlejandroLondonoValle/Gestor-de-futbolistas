package com.sena.actividad_03_02.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun PlayerDetail(
    id: Int,
    name: String,
    position: String,
    nationality: String,
    age: Int,
    number : Int,
    onVolverHome: () -> Unit
){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text =  "ID: $id\n" +
                        "Nombre: $name\n" +
                        "Posición: $position\n" +
                        "Nacionalidad: $nationality\n" +
                        "Edad: $age\n" +
                        "Numero: $number",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Button(
                onClick = onVolverHome,
                modifier = Modifier.align(Alignment.BottomCenter)
            ) {
                Text(text = "Volver")
            }
        }
    }
}