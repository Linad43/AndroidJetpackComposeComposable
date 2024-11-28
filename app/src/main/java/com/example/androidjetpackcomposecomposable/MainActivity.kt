package com.example.androidjetpackcomposecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting("Linad")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Студент университета Urban: $name!",
        fontSize = 16.sp,
        color = Color.Companion.Red,
        modifier = Modifier
            .padding(15.dp)
            .padding(top = 50.dp)
    )
}
