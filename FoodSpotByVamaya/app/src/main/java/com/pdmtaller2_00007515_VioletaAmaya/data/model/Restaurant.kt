package com.pdmtaller2_00007515_VioletaAmaya.data.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: Int,
    val categories: List<String>,
    val menu: List<Dish>
)
