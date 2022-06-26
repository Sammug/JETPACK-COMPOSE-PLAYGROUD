package com.example.myapplication.basics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @modifier used to set Row attributes
 * A Row has a horizontal orientation
 */
@Composable
 fun AddRow(modifier: Modifier){
    Row(modifier = modifier
        .height(48.dp)
        .fillMaxWidth(),
        /**
         *Use vertical arrangement and horizontal alignment to position row children
         */
//        verticalAlignment = Alignment.Top,
//        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        //Display a text in row
        Text(modifier = Modifier
            .align(Alignment.Bottom),
            text = "Hey You!!, I am in row",
            fontSize = 18.sp,
            color = Color.Black,
            fontStyle = Italic,
            fontFamily = FontFamily.SansSerif)
        //Add a button after the text
        Button(onClick = { /*DO SOMETHING*/ },
            modifier = Modifier
                .padding(start = 20.dp)
                .background(Color.Blue)
            ) {
            //Add button text
            Text(text = "I am clickable")
        }
    }
 }

/**
 * @modifier used to set Column attributes
 * A column has a vertical orientation
 */
@Composable
fun AddColumn(modifier: Modifier){
    Column(modifier = modifier
        /**
         * Can use @{Modifier.size(height = 20.dp, width = 200.dp)} to resize the column
         */
        .fillMaxWidth() // use modifier.height to set column height
        .fillMaxHeight(), // use modifier.width to set column width
        /**
         *Use vertical arrangement and horizontal alignment to position @Column children
         */
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ){
        //Display a text in this column
        Text(text = "Hello there!!, I am in a column", fontSize = 18.sp,
            color = Color.Black, fontStyle = Italic,
            fontFamily = FontFamily.SansSerif)
        //Add a button after the text it will appear below the text
        Button(onClick = { /*DO SOMETHING*/ },
            /**Use @modifier.padding(size) padding unlike margin in xml views,
             * although unlike margin, negative padding is not allowed here
             * Apply padding before content measurement because content can oly take the remaining space
             */
            modifier = modifier.padding(5.dp)
            ) {
            //Add button text
            Text(text = "I am clickable")
        }

        AddRow(modifier = modifier)
    }
}