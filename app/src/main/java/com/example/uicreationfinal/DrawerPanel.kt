package com.example.uicreationfinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uicreationfinal.ui.theme.LittleLemonColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerPanel(drawerState: DrawerState ,scope : CoroutineScope) {
    Column( verticalArrangement = Arrangement.Center ,
        modifier = Modifier.verticalScroll(rememberScrollState())) {
        Card(colors = CardDefaults.cardColors(LittleLemonColor.green)) {
            Image(painter = painterResource(id = R.drawable.img_7) , contentDescription ="" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
            )
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 50.dp )){
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Your Profile")
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 20.dp)){
            Icon(imageVector = Icons.Default.Favorite, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Favorite Orders")
            }
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 20.dp)){
            Icon(imageVector = Icons.Default.AccountBox, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Address Book")
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 20.dp)){
            Icon(imageVector = Icons.Default.Info, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "About")
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 20.dp)){
            Icon(imageVector = Icons.Default.Settings, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Settings")
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween , verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 60.dp , top = 20.dp)){
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = ""
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Log Out")
            }
        }
        IconButton(onClick = {scope.launch { drawerState.close() }  }
        , modifier = Modifier.padding(start = 60.dp)) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Close Icon")
        }
    }

}

