package com.sena.actividad_03_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import com.sena.actividad_03_02.navegation.AppNavegation
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sena.actividad_03_02.ui.theme.Actividad_03_02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad_03_02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        AppNavegation(
                            modifier = Modifier.fillMaxSize()
                        )
                    }
            }
        }
    }
}
}
