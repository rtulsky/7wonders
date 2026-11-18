package com.example.sevenwonders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sevenwonders.ui.SevenWondersApp
import com.example.sevenwonders.ui.theme.SevenWondersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SevenWondersTheme {
                SevenWondersApp()
            }
        }
    }
}
