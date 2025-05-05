package com.pdmtaller2_00007515_VioletaAmaya.data.dummy

import com.pdmtaller2_00007515_VioletaAmaya.R
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Dish
import com.pdmtaller2_00007515_VioletaAmaya.data.model.Restaurant
val allRestaurant = listOf(
    Restaurant(
        1, "Grill House", "Hamburguesas y parrilla gourmet", R.drawable.grill_house, listOf("comida rápida", "hamburguesas"),
        listOf(
            Dish(1, "Smash Burger", "Doble carne con cebolla caramelizada", "https://img.freepik.com/fotos-premium/hamburguesa-doble-dos-quesos-cebolla-caramelizada_157927-790.jpg"),
            Dish(2, "Aros de Cebolla", "Crujientes con salsa mostaza miel", "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/33843533c393013fba9b13df421c8a59.jpg")
        )
    ),
    Restaurant(
        2, "Doggy Bite", "Hot dogs premium y snacks", R.drawable.doggy_bite, listOf("comida rápida", "hot dogs"),
        listOf(
            Dish(3, "Hot Dog Texano", "Salchicha, jalapeños y queso", "https://patijinich.com/es/wp-content/uploads/sites/3/2017/05/hot-dogs-con-queso-tocino-y-aderezo-de-aguacate-scaled.jpg"),
            Dish(4, "Papas de Feria", "Papas con queso cheddar fundido", "https://pbs.twimg.com/media/EfUi6iMXkAwoY9E.jpg")
        )
    ),
    Restaurant(
        3, "La Champurrada", "Sabor mexicano tradicional", R.drawable.la_champurrada, listOf("comida mexicana", "moles"),
        listOf(
            Dish(5,"Chilaquiles Rojos", "Tortillas bañadas en salsa roja", "https://i.blogs.es/61034c/chilaquiles-rojos-chile-morita-1-/1366_2000.jpg"),
            Dish(6, "Mole Poblano", "Base de maíz con pollo y crema", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUSAXcwFuubomIkmU6zicIHCFOE52SdSN2WA&s")
        )
    ),
    Restaurant(
        4, "El BurritoDShrek", "Tacos y comida urbana mexicana", R.drawable.el_burritodshrek, listOf("comida mexicana", "burritos"),
        listOf(
            Dish(7, "Tacos de Barbacoa", "Carne de res suave con salsas", "https://www.carniceriademadrid.es/wp-content/uploads/2021/06/jeswin-thomas-z_PfaGzeN9E-unsplash-1.jpg"),
            Dish(8, "Burrito Norteño", "Carne asada, frijoles y guacamole", "https://i.blogs.es/1cec53/como-hacer-burritos-de-carne-1-/650_1200.jpg")
        )
    ),
    Restaurant(
        5, "Roma Pasta", "Sabores italianos auté nticos", R.drawable.roma_pasta, listOf("comida italiana", "pasta"),
        listOf(
            Dish(9, "Fettuccine Alfredo", "Pasta cremosa con queso parmesano", "https://mojo.generalmills.com/api/public/content/8GresqM3pUK_fXrmtlyKjg_gmi_hi_res_jpeg.jpeg?v=df1663f8&t=16e3ce250f244648bef28c5949fb99ff"),
            Dish(10, "Pizza Pepperoni", "Clásica pizza con pepperoni y queso", "https://cdn.statically.io/img/lamesadelconde.es/wp-content/uploads/2018/03/Pizza-pepperoni.jpg?quality=100&f=auto")
        )
    ),
    Restaurant(
        6, "Ciao Bella", "Cocina casera italiana", R.drawable.ciao_bella, listOf("comida italiana","ravioli"),
        listOf(
            Dish(11, "Ravioles de Ricotta", "Pasta rellena con ricotta y espinaca", "https://es.cravingsjournal.com/wp-content/uploads/2021/09/ravioles-de-ricotta-y-espinaca-internet-5.jpg"),
            Dish(12, "Risotto de Mariscos", "Arroz cremoso con camarones y calamar", "https://www.salpicado.com/wp-content/uploads/2020/10/emplatado-asopado-1.jpg")
        )
    ),

    Restaurant(
        7, "Sakura Sushi", "Sushi y cocina japonesa", R.drawable.sakura_sushi, listOf("comida asiática", "sushi", "ramen"),
        listOf(
            Dish(13, "Sushi Roll", "Rollo de sushi con salmón y aguacate", "https://images.pexels.com/photos/8951563/pexels-photo-8951563.jpeg"),
            Dish(14, "Ramen", "Sopa japonesa con fideos, huevo y cerdo", "https://images.pexels.com/photos/884600/pexels-photo-884600.jpeg")
        )
    ),
    Restaurant(
        8, "Palitos Chinos", "Cocina asiática moderna", R.drawable.palitos_chinos, listOf("comida asiática", "fideos", "pan bao"),
        listOf(
            Dish(15, "Fideos con Pollo", "Fideos salteados con vegetales", "https://images.pexels.com/photos/2664216/pexels-photo-2664216.jpeg"),
            Dish(16, "Pan Bao", "Espinaca, con jamon y queso", "https://www.petitchef.es/imgupl/recipe/pan-bao-bollitos-de-pan-al-vapor--lg-455338p707150.jpg")
        )
    ),
    Restaurant(
        9, "Green Garden", "Comida saludable y orgánica", R.drawable.green_garden, listOf("comida saludable", "ensaladas"),
        listOf(
            Dish(17, "Ensalada Mediterránea", "Vegetales, aceitunas y queso feta", "https://img.freepik.com/fotos-premium/ensalada-griega-clasica-queso-feta-aceitunas-sobre-fondo-oscuro-ensalada-mediterranea-dietetica-saludable-copie-espacio-vista-superior_131885-2247.jpg"),
            Dish(18, "Bowl de Quinoa", "Quinoa, aguacate y garbanzos", "https://blog.dia.es/wp-content/uploads/2021/10/GARBANZOS-CON-QUINOA-1280x720.jpg")
        )
    ),
    Restaurant(
        10, "La Hojita", "Nutricion y bienestar", R.drawable.la_hojita, listOf("comida saludable", "sin gluten"),
        listOf(
            Dish(19, "Wrap de Pavo", "Pavo, espinaca y hummus", "https://i0.wp.com/familiasanaorganizada.es/wp-content/uploads/2022/09/635E0234-F30A-4419-966A-4ECC8B23D235-scaled.jpeg?fit=2135%2C2560&ssl=1"),
            Dish(20, "Smoothie Detox", "Espinaca, piña y jengibre", "https://mejorconsalud.as.com/wp-content/uploads/2015/08/jugo-pina-pepino-limon-jengibre.jpg")
        )
    ),
    Restaurant(
        11, "Dulce Aroma", "Postres artesanales deliciosos", R.drawable.dulce_aroma, listOf( "postres y dulces","tarta"),
        listOf(
            Dish(21, "Tarta de Limón", "Base de galleta y crema de limón", "https://okdiario.com/img/2024/05/26/tarta-fria-de-queso-crema-y-limon-con-base-de-galleta-el-postre-mas-sencillo-sin-necesidad-de-horno.jpg"),
            Dish(22, "Brownie Blondie", "Brownie de vainilla con nueces", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHeCLfqCuzMH0RxRWSKmTOvNjYtjkXzuEQKg&s")
        )
    ),

    Restaurant(
        12, "Sugar Bliss", "Pasteles y galletas artesanales", R.drawable.sugar_bliss, listOf("postres y dulces","helado"),
        listOf(
            Dish(23, "Cupcake Red Velvet", "Cupcake de cacao con frosting de queso", "https://i0.wp.com/sarasellos.com/wp-content/uploads/2024/05/CUPCAKES-RED-VELVET3.webp?resize=779%2C779&ssl=1"),
            Dish(24, "Helado de Fresa", "Helado casero con trozos de fresa", "https://www.cocinista.es/download/bancorecursos/recetas/helado-fresa.jpg")
        )
    ),
    Restaurant(
        13, "BubbleTime", "Bubble tea y bebidas asiaticas", R.drawable.bubbletime, listOf("bebidas", "bubble tea"),
        listOf(
            Dish(25, "Bubble Tea de Taro", "Te con leche sabor taro y perlas de tapioca", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD8i6H_DlLjxM04jNYIa7wMCePlxnS6K0XqQ&s"),
            Dish(26, "Matcha Bubble Tea", "Te verde matcha con tapioca", "https://img.freepik.com/fotos-premium/vaso-te-verde-matcha-burbuja-leche-perlas-tapioca-sobre-fondo-borroso-restaurante-cafe_43448-427.jpg")
        )
    ),
    Restaurant(
        14, "FrappeLand", "Frappes y bebidas frias", R.drawable.frappeland, listOf("bebidas", "frappes"),
        listOf(
            Dish(27, "Frappe de Vainilla", "Cafe con vainilla y crema batida", "https://frios.com.mx/wp-content/uploads/2023/12/Frappe-de-chai-con-vainilla.jpg"),
            Dish(28, "Frappe de Mocha", "Cafe, chocolate y crema batida", "https://i.blogs.es/fd6563/copia-de-portada-40-/1366_2000.jpg")
        )
    )
)