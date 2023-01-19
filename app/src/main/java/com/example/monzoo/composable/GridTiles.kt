package com.example.monzoo.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.monzoo.modele.Animal

@Composable
fun GridTiles(animalCard: Animal){

    Surface(
        modifier = Modifier
            .fillMaxSize(),
            //.padding(10.dp),
        elevation = 20.dp,
        shape = RoundedCornerShape(percent = 10)
    ) {
        Column() {
            Card() {
                Image(
                    painter = painterResource(id = animalCard.AnimalImage),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height((LocalConfiguration.current.screenWidthDp / 2).dp)
                        .fillMaxWidth()
                )
            }
            Text(
                text = stringResource(id = animalCard.AnimalName),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }
    }

}