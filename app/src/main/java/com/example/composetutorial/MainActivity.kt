package com.example.composetutorial


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
                ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")

            }

        }
    }
}

@Composable
private fun ListItem(name: String, prof: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .offset()
            .pointerInput(Unit) {
                detectDragGesturesAfterLongPress { change, dragAmount ->
                    Log.d("MyLog", "Long press")
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ){
        Box(){
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "Человек яйца",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(3.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = name,
                        modifier = Modifier
                            
                    )
                    Text(
                        text = prof,
                        modifier = Modifier

                    )

                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    ListItem(name = "ЧЕЛОВЕК ЯЙЦА", prof = "человек яйца")
}