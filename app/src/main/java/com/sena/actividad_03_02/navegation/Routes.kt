package com.sena.actividad_03_02.navegation

import kotlinx.serialization.Serializable

@Serializable
data object Home {}

@Serializable
data object Politics {}

@Serializable
data object Teams {}

@Serializable
data object Players {}

@Serializable
data class PlayerDetail(
    val id: Int,
    val name: String,
    val position: String,
    val nationality: String,
    val age: Int,
    val number : Int
){}


