package com.example.myapplication.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
 fun Screen(modifier: Modifier){
   Box(
     modifier = modifier
         .background(Color.Cyan)
         .fillMaxSize()
    ) {
//       Column(modifier = modifier) {
//           AddRow(modifier = modifier)
//       }
       AddColumn(modifier = modifier)
   }
 }