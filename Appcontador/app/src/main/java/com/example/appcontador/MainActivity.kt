package com.example.appcontador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcontador.ui.theme.AppcontadorTheme
import com.example.appcontador.views.MainGuiViewModel
import com.example.appcontador.views.MainGui

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = MainGuiViewModel()

        enableEdgeToEdge()
        setContent {
            AppcontadorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainGui(viewModel)

                }
            }
        }
    }
}
