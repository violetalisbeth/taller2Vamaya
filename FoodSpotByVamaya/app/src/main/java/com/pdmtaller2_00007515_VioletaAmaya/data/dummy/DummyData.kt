package com.pdmtaller2_00007515_VioletaAmaya.data.dummy

import com.pdmtaller2_00007515_VioletaAmaya.data.model.Dish
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Restaurant
import com.pdmtaller2_00007515_VioletaAmaya.R

val allRestaurant = listOf(
    Restaurant(
        1, "Grill House", "Hamburguesas y parrilla gourmet", R.drawable.grill_house, listOf("comida rapida", "hamburguesas","Aros de cebolla"),
        listOf(
            Dish(1, "Smash Burger", "Doble carne con cebolla caramelizada", "https://images.pexels.com/photos/2280546/pexels-photo-2280546.jpeg"),
            Dish(2, "Aros de Cebolla", "Crujientes con salsa mostaza miel", "https://images.pexels.com/photos/1171170/pexels-photo-1171170.jpeg")
        )
    ),
    Restaurant(
        2, "Doggy Bite", "Hot dogs premium y snacks", R.drawable.doggy_bite, listOf("comida rápida", "hot dogs","Papas de feria"),
        listOf(
            Dish(3, "Hot Dog Texano", "Salchicha, jalapeños y queso", "https://images.pexels.com/photos/4518648/pexels-photo-4518648.jpeg"),
            Dish(4, "Papas de Feria", "Papas con queso cheddar fundido", "https://images.pexels.com/photos/2232/vegetables-italian-pizza-restaurant.jpg")
        )
    ),
    Restaurant(
        3, "El BurritoDShrek", "Tacos y comida urbana mexicana", R.drawable.el_burritodshrek, listOf("comida mexicana", "tacos", "burritos"),
        listOf(
            Dish(5, "Tacos de Barbacoa", "Carne de res suave con salsas", "https://images.pexels.com/photos/750073/pexels-photo-750073.jpeg"),
            Dish(6, "Burrito Norteño", "Carne asada, frijoles y guacamole", "https://images.pexels.com/photos/461198/pexels-photo-461198.jpeg")
        )
    ),
    Restaurant(
        4, "La Champurrada", "Sabor mexicano tradicional", R.drawable.la_champurrada, listOf("comida mexicana", "moles"),
        listOf(
            Dish(7, "Chilaquiles Rojos", "Tortillas bañadas en salsa roja", "https://images.pexels.com/photos/6275118/pexels-photo-6275118.jpeg"),
            Dish(8, "Mole Poblano", "Base de maíz con pollo y crema", "https://images.pexels.com/photos/4958798/pexels-photo-4958798.jpeg")
        )
    ),
    Restaurant(
        5, "Roma Pasta", "Sabores italianos auté nticos", R.drawable.roma_pasta, listOf("comida italiana", "pasta", "pizza","pizza calzone"),
        listOf(
            Dish(9, "Fettuccine Alfredo", "Pasta cremosa con queso parmesano", "https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg"),
            Dish(10, "Pizza Pepperoni", "Clásica pizza con pepperoni y queso", "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg")
        )
    ),
    Restaurant(
        6, "Ciao Bella", "Cocina casera italiana", R.drawable.ciao_bella, listOf("comida italiana", "pastas", "lasaña","ravioli"),
        listOf(
            Dish(11, "Ravioles de Ricotta", "Pasta rellena con ricotta y espinaca", "https://images.pexels.com/photos/5949885/pexels-photo-5949885.jpeg"),
            Dish(12, "Risotto de Mariscos", "Arroz cremoso con camarones y calamar", "https://images.pexels.com/photos/4193872/pexels-photo-4193872.jpeg")
        )
    ),
    Restaurant(
        7, "Sakura Sushi", "Sushi y cocina japonesa", R.drawable.sakura_sushi, listOf("comida asiatica", "sushi", "ramen"),
        listOf(
            Dish(13, "Nigiri de Salmón", "Arroz con lámina de salmón fresco", "https://images.pexels.com/photos/8951563/pexels-photo-8951563.jpeg"),
            Dish(14, "Tonkotsu Ramen", "Caldo cremoso con cerdo y huevo", "https://images.pexels.com/photos/884600/pexels-photo-884600.jpeg")
        )
    ),
    Restaurant(
        8, "Palitos Chinos", "Cocina asiática moderna", R.drawable.palitos_chinos, listOf("comida asiatica", "fideos", "pan bao"),
        listOf(
            Dish(15, "Pad Thai", "Fideos de arroz salteados con camarón", "https://images.pexels.com/photos/2664216/pexels-photo-2664216.jpeg"),
            Dish(16, "Pan Bao", "Arroz jazmín con pollo y anacardos", "https://images.pexels.com/photos/3926124/pexels-photo-3926124.jpeg")
        )
    ),
    Restaurant(
        9, "Green Garden", "Comida saludable y orgánica", R.drawable.green_garden, listOf("comida saludable", "ensaladas", "vegano"),
        listOf(
            Dish(17, "Ensalada Mediterránea", "Vegetales, aceitunas y queso feta", "https://images.pexels.com/photos/2862154/pexels-photo-2862154.jpeg"),
            Dish(18, "Bowl de Quinoa", "Quinoa, aguacate y garbanzos", "https://images.pexels.com/photos/4491395/pexels-photo-4491395.jpeg")
        )
    ),
    Restaurant(
        10, "La Hojita", "Nutricion y bienestar", R.drawable.la_hojita, listOf("comida saludable", "sin gluten"),
        listOf(
            Dish(19, "Wrap de Pavo", "Pavo, espinaca y hummus", "https://images.pexels.com/photos/461198/pexels-photo-461198.jpeg"),
            Dish(20, "Smoothie Detox", "Espinaca, piña y jengibre", "https://images.pexels.com/photos/103566/pexels-photo-103566.jpeg")
        )
    ),
    Restaurant(
        11, "Dulce Aroma", "Postres artesanales deliciosos", R.drawable.dulce_aroma, listOf( "reposteria","postres y dulces"),
        listOf(
            Dish(21, "Tarta de Limón", "Base de galleta y crema de limón", "https://images.pexels.com/photos/3071821/pexels-photo-3071821.jpeg"),
            Dish(22, "Brownie Blondie", "Brownie de vainilla con nueces", "https://images.pexels.com/photos/45202/brownie-dessert-cake-sweet-45202.jpeg")
        )
    ),
    Restaurant(
        12, "Sugar Bliss", "Pasteles y galletas artesanales", R.drawable.sugar_bliss, listOf("pasteles", "galletas", "helado","postres y dulces"),
        listOf(
            Dish(23, "Cupcake Red Velvet", "Cupcake de cacao con frosting de queso", "https://images.pexels.com/photos/230325/pexels-photo-230325.jpeg"),
            Dish(24, "Helado de Fresa", "Helado casero con trozos de fresa", "https://images.pexels.com/photos/1625235/pexels-photo-1625235.jpeg")
        )
    ),
    Restaurant(
        13, "BubbleTime", "Bubble tea y bebidas asiaticas", R.drawable.bubbletime, listOf("bebidas", "bubble tea", "te"),
        listOf(
            Dish(25, "Bubble Tea de Taro", "Te con leche sabor taro y perlas de tapioca", "https://images.pexels.com/photos/988963/pexels-photo-988963.jpeg"),
            Dish(26, "Matcha Bubble Tea", "Te verde matcha con tapioca", "https://images.pexels.com/photos/5905154/pexels-photo-5905154.jpeg")
        )
    ),
    Restaurant(
        14, "FrappeLand", "Frappes y bebidas frias", R.drawable.frappeland, listOf("bebidas", "frappes", "cafe"),
        listOf(
            Dish(27, "Frappe de Vainilla", "Cafe con vainilla y crema batida", "https://images.pexels.com/photos/3654597/pexels-photo-3654597.jpeg"),
            Dish(28, "Frappe de Mocha", "Cafe, chocolate y crema batida", "https://images.pexels.com/photos/302896/pexels-photo-302896.jpeg")
        )
    )
)
