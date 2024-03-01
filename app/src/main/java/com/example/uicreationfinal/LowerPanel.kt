package com.example.uicreationfinal

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uicreationfinal.Data.Dish
import com.example.uicreationfinal.Data.DishRepository.dishes
import com.example.uicreationfinal.Data.categories
import com.example.uicreationfinal.ui.theme.LittleLemonColor

@Composable
fun LowerPanel(navController: NavHostController) {
        Column (){
            LazyRow() {
                items(categories) {category->
                    MenuCategory(category)

                }
            }
            Text(text = "Weekly Special" ,
                style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(5.dp))

            LazyColumn() {
                items(dishes) {Dish->
                    MenuDish(navController ,Dish)
                }
            }
        }

}
@Composable
fun MenuCategory(category: String) {
    Button(onClick = { /*TODO*/ } ,
        colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray) ,
        modifier = Modifier.padding(5.dp)) {
        Text(text = category ,
            color = Color.Black
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuDish(navController: NavHostController?=null, dish :Dish) {
    Card(colors = CardDefaults.cardColors(containerColor = LittleLemonColor.cloud) , onClick = {
Log.d("AAA","click ${dish.id}")
navController?.navigate(DishDetails.route + "/${dish.id}")
    }) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)

        ) {
            Column {
                Text(text = dish.name ,
                    fontSize = 18.sp ,
                    fontWeight = FontWeight.Bold
                )
                Text(text = dish.des
                 , color = Color.Gray , modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f))
                Text(text = "$"+"${dish.price}" , fontWeight = FontWeight.Bold)
            }
            Image(painter = painterResource(id =dish.image ), contentDescription =dish.name )

        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp , end = 8.dp) ,
        color = LittleLemonColor.yellow,
        thickness = 1.dp)
}

