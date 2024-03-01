package com.example.uicreationfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.uicreationfinal.ui.theme.LittleLemonColor
import com.example.uicreationfinal.ui.theme.UIcreationFinalTheme
import kotlinx.coroutines.CoroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIcreationFinalTheme() {
                val navController = rememberNavController()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val scope = rememberCoroutineScope()
                NavHost(navController = navController, startDestination = Home.route) {
                    composable(Home.route) {
                        HomeScreen(navController = navController , drawerState , scope)
                    }
                    composable(DishDetails.route+"/{${DishDetails.argDishId}}",
                        arguments = listOf(navArgument(DishDetails.argDishId) {type = NavType.IntType})
                    ) {
                        val id = requireNotNull(it.arguments?.getInt(DishDetails.argDishId)) {"Dish id is null"}

                        ModalNavigationDrawer(
                            drawerState =drawerState ,
                            drawerContent = { ModalDrawerSheet {
                                DrawerPanel(drawerState = drawerState, scope = scope) }
                            }) {
                            Column (modifier = Modifier.background(LittleLemonColor.cloud)){
                                DishDetails(id = id , drawerState = drawerState ,scope=scope)
                            }
                        }
                    }
                }
                // A surface container using the 'background' color from the theme
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController , drawerState: DrawerState , scope :CoroutineScope) {


    ModalNavigationDrawer(
        drawerState =drawerState ,
        drawerContent = { ModalDrawerSheet {
                    DrawerPanel(drawerState = drawerState, scope = scope) }
        }) {
            Column (modifier = Modifier.background(LittleLemonColor.cloud)){
                TopBar(drawerState = drawerState , scope = scope)
                UpperPanel()
                LowerPanel(navController = navController)
            }
    }
}
