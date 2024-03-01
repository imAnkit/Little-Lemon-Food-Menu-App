package com.example.uicreationfinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.uicreationfinal.Data.DishRepository
import kotlinx.coroutines.CoroutineScope

@Composable
fun DishDetails(id:Int , drawerState: DrawerState , scope: CoroutineScope) {
    val dish= requireNotNull(DishRepository.getDish(id))
    Column (verticalArrangement = Arrangement.spacedBy(10.dp)){
            TopBar(drawerState = drawerState , scope = scope)
            Image(painter = painterResource(id = R.drawable.img_1), contentDescription ="" ,
                modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth)
            Column(verticalArrangement = Arrangement.spacedBy(10.dp) ,
                modifier = Modifier.padding(start = 10.dp , end = 10.dp)) {
                Text(text = dish.name)
                Text(text = dish.des)
                Counter()
                Button(onClick = { /*TODO*/ } ,
                    modifier = Modifier.fillMaxWidth() ) {
                    Text(text = "Add for $" +"$${dish.price}"  ,
                        textAlign = TextAlign.Center ,
                        modifier = Modifier.fillMaxWidth() )
                }
            }

    }
}

@Composable
fun Counter() {
    Row (verticalAlignment = Alignment.CenterVertically ,
        modifier = Modifier.fillMaxWidth()){
            var counter by remember {
                mutableStateOf(1)
            }
        TextButton(onClick = { counter-- }) {
            Text(text = "-" ,
                style = MaterialTheme.typography.headlineMedium)
        }
        Text(text = counter.toString(),
            modifier = Modifier.padding(16.dp) ,style =MaterialTheme.typography.headlineMedium
        )
        TextButton(onClick = { counter++ }) {
            Text(text = "+",style =MaterialTheme.typography.headlineMedium)
        }
    }
}