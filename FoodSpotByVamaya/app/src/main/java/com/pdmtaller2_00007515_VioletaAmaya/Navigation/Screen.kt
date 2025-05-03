package com.pdmtaller2_00007515_VioletaAmaya.Navigation

sealed class Screen(val route:String){
    object Category: Screen("categories")
    object Restaurant: Screen("restaurant/{restauranrId}"){
        fun createRoute(restaurantId: Int) = "restaurant/$restaurantId"
    }
    object MyOrder: Screen("myorders")
    object searchAll: Screen("searchall")
}