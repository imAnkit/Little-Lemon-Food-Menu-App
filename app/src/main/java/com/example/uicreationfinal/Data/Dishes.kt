package com.example.uicreationfinal.Data

import com.example.uicreationfinal.R

data class Dish(
    val id :Int,
    val name : String ,
    val price : Double ,
    val des : String,
    val image : Int
)

object DishRepository {
    val dishes = listOf<Dish>(
        Dish(1,"Greek Salad" , 12.99 ,"The famouse greek salad of crispy lettuce ,peppers ,olives and chicago..." ,
            R.drawable.img_1 ),
        Dish(2,"Brushetta" , 5.99 ,"Our Brushetta is made of grilled bread that has been smeared with garlic..." ,
            R.drawable.img_2) ,
        Dish(3,"Lemmon Desert" ,9.99 ,"This come straight from grandma recipe book, every last ingredient has..." ,
            R.drawable.img_3),
        Dish(4,"Grilled Fish" , 10.33 , "This is a great dish to end your day " ,
            R.drawable.img_4),
        Dish(5,"Greek Salad" , 12.99 ,"The famouse greek salad of crispy lettuce ,peppers ,olives and chicago..." ,
            R.drawable.img_1 ),
        Dish(6,"Brushetta" , 5.99 ,"Our Brushetta is made of grilled bread that has been smeared with garlic..." ,
            R.drawable.img_2) ,
        Dish(7,"Lemmon Desert" ,9.99 ,"This come straight from grandma recipe book, every last ingredient has..." ,
            R.drawable.img_3),
        Dish(8,"Grilled Fish" , 10.33 , "This is a great dish to end your day " ,
            R.drawable.img_4)
    )
    fun getDish(id:Int) = dishes.firstOrNull{it.id == id}
}
