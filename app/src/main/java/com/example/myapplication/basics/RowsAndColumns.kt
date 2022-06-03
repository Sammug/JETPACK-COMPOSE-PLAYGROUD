package com.example.myapplication.basics

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
 fun Row(modifier: Modifier){
    modifier.width(20.dp) // use modifier.height
    modifier.height(20.dp) // use modifier.width
 }

@Composable
fun Column(modifier: Modifier){
    modifier.width(20.dp) // use modifier.height
    modifier.height(20.dp) // use modifier.width
}