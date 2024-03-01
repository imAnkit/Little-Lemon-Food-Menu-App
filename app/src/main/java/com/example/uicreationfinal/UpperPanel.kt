package com.example.uicreationfinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uicreationfinal.ui.theme.LittleLemonColor


@Composable
fun UpperPanel() {

        Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top,
            modifier = Modifier
            .background(LittleLemonColor.green)
            .padding(start = 10.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
                .fillMaxWidth()
            ) {
            Text(text = stringResource(id = R.string.title),
                fontSize = 40.sp ,
//                fontStyle = FontStyle(),
                fontWeight = FontWeight.Bold,
                color = Color.Yellow
            )
            Text(text = stringResource(id = R.string.location),
                fontSize = 24.sp,
                color=Color.White
            )
            Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                .padding(top = 5.dp) .fillMaxWidth()
            ){
            Text(text = stringResource(id =R.string.description  ) ,

                color = LittleLemonColor.cloud,
                fontSize = 14.sp ,
                modifier = Modifier
                    .padding(top = 20.dp ,bottom = 28.dp, end = 20.dp)
                    .fillMaxWidth(0.6f)
                    )
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "upper panel Image" ,
                modifier = Modifier .clip(RoundedCornerShape(10.dp)) )
            }
            Button(onClick = { /*TODO*/ } ,
                 colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
                ) {
                Text(text = stringResource(id = R.string.order_button_text) ,
                    fontSize = 14.sp ,
                    color = Color.Black)
            }

        }

    }


