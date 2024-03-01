package com.example.uicreationfinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerState
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uicreationfinal.ui.theme.LittleLemonColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(drawerState: DrawerState? =null , scope :CoroutineScope? =null) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .background(LittleLemonColor.cloud)
                .padding(5.dp)
            , verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { scope?.launch { drawerState?.open()
            } }) {
                Image(painter = painterResource(id = R.drawable.ic_hamburger_menu), contentDescription = "Menu" ,
                    modifier = Modifier
                        .size(24.dp))
            }


            Image(painter = painterResource(id = R.drawable.littlelemonimgtxt), contentDescription ="",
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 20.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.ic_cart), contentDescription ="" ,
                    modifier = Modifier.size(30.dp)
                )
            }

        }
}
