package com.example.myapplication_2024



import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast


@Preview(showBackground = true)
@Composable
fun Bulk() {
    var context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth(),


    ){
        Image(

            painter = painterResource(id = R.drawable.starwing),
            contentDescription = "starwing",
            modifier = Modifier.fillMaxWidth(),
//                .border(20.dp, Color.Black),
            contentScale = ContentScale.Fit,

        )
        Text(
            text = "Hello World! My name is Peter and I am super " +
                    "excited to be enrolled in this class.",
            //make padding all around
            modifier = Modifier.padding(20.dp),
           //center it
            textAlign = TextAlign.Center,
        )
        Button(

            onClick = {
                val text = "Hello there!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(context, text, duration)
                toast.show()    }
        ) {
            Text(text = "Click Me")
        }

    }

}