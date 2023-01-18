package com.example.monzoo.composable
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import com.example.monzoo.data.DataModel

@Composable
fun LazyVerticalGrid(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        content = {
            items(DataModel().allAnimals()){
                animalCard -> (GridTiles(animalCard = animalCard))
            }
        }
    )
}
