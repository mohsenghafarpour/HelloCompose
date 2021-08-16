package com.mo22sen.hellocompose.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun InitMainActivity() {
    Scaffold(
        content = {
            Text(text = "Hello Compose", color = Color.DarkGray, fontSize = 32.sp)
        }
    )
}
