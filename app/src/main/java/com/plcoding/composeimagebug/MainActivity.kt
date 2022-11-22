package com.plcoding.composeimagebug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composeimagebug.ui.theme.ComposeImageBugTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeImageBugTheme {
                var counter by remember {
                    mutableStateOf(0)
                }
                Row {
                    Image(
                        painter = painterResource(
                            id = if(counter % 2 == 0) R.drawable.english else R.drawable.german
                        ),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                    Image(
                        painter = painterResource(
                            id = if(counter % 2 == 1) R.drawable.english else R.drawable.german
                        ),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                    Button(onClick = { counter++ }) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}