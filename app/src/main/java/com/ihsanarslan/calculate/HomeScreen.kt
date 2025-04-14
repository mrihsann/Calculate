package com.ihsanarslan.calculate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(){

    val viewmodel : HomeScreenViewModel = viewModel()

    val sayi1 = remember { mutableStateOf("") }
    val sayi2 = remember { mutableStateOf("") }
    val sonuc = viewmodel.sonuc.observeAsState()

    Column (modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        TextField(value = sayi1.value,
            onValueChange = {sayi1.value = it},
            label = { Text(text = "Enter a number")}
        )
        TextField(value = sayi2.value,
            onValueChange = {sayi2.value = it},
            label = { Text(text = "Enter a number2")}
        )
        Row {
            Button(onClick = {
                viewmodel.topla(sayi1 = sayi1.value,sayi2 = sayi2.value)
            }) {
                Text("+")
            }
            Button(onClick = {
                viewmodel.cikar(sayi1 = sayi1.value,sayi2 = sayi2.value)
            }) {
                Text("-")
            }
            Button(onClick = {
                viewmodel.carp(sayi1 = sayi1.value,sayi2 = sayi2.value)
            }) {
                Text("*")
            }
            Button(onClick = {
                viewmodel.bol(sayi1 = sayi1.value,sayi2 = sayi2.value)
            }) {
                Text("/")
            }
        }
        Text(sonuc.value.toString())
    }
}