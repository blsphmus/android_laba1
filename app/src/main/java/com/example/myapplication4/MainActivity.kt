package com.example.myapplication4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Test() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.size(50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_person_24),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(text = "Алексей Иванов", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "Android Developer", color = Color.Gray, fontSize = 14.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            StatCard(value = "24", label = "Projects", modifier = Modifier.weight(1f))
            StatCard(value = "18", label = "Followers", modifier = Modifier.weight(1f))
            StatCard(value = "7", label = "Posts", modifier = Modifier.weight(1f))
        }
        Column(modifier = Modifier.padding(top = 24.dp)) {
            Text(text = "About", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(
                text = "Android developer from Moscow\nKotlin enthusiast",
                color = Color.Gray,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        Text(
            text = "Experience",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Card(
            border = BorderStroke(1.dp, Color.LightGray),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Android Developer", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text = "2022 - Present", color = Color.Gray, fontSize = 13.sp)
                }
                Text(text = ">", color = Color.Gray, fontSize = 24.sp)
            }
        }
    }
}

@Composable
fun StatCard(
    value: String,
    label: String,
    modifier: Modifier = Modifier
) {
    Card(
        border = BorderStroke(1.dp, Color.LightGray),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp, vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = value, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = label, color = Color.Gray, fontSize = 12.sp)
        }
    }
}

//Card(border = BorderStroke(1.dp, Color.Gray),
//shape = CardDefaults.elevatedShape){
//    Column (
//        modifier = Modifier
//            .background(Color.White)
//            .padding(2.dp)
//            .height(200.dp)
//            .paint(painterResource(R.drawable.img), contentScale = ContentScale.Crop)
//    ) {
//        Row (
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ){
//            Text ("Name", modifier = Modifier.weight(1f))
//            Text("10:34")
//        }
//        Text("Message", modifier = Modifier.padding(vertical = 5.dp))
//        Text("+", textAlign = TextAlign.End, modifier = Modifier.fillMaxWidth())
//    }
//}