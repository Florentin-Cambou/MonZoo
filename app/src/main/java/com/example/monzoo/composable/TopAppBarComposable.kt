package com.example.monzoo.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.monzoo.R

@Composable
fun TopAppBarComposable(){
    TopAppBar() {
        Image(
            painter = painterResource(id = R.drawable.iconapp),
            contentDescription = null,

            modifier = Modifier.padding(5.dp)
        )
        Text(text = "Mon Zoo")
    }
}