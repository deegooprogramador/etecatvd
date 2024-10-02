package com.example.appcontador.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState


@Composable
fun MainGui(meuViewmodel: MainGuiViewModel) {

    val x: Int by meuViewmodel.contador.observeAsState(0)

    var txfieldValue by remember {
        mutableStateOf("")
    }

    Column {
        TextField(value = x.toString(), onValueChange = {
        })
        Button(onClick = {
            meuViewmodel.incrementaContador()
        }) {
            Text(text = "Num Clicks = " + x.toString())
        }
    }
}