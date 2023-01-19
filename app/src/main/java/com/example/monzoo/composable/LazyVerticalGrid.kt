package com.example.monzoo.composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.unit.dp
import com.example.monzoo.data.DataModel

@Composable
fun LazyVerticalGrid(){
    LazyVerticalGrid(
        verticalArrangement = Arrangement.spacedBy(15.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp),
        columns = GridCells.Fixed(2),
        content = {
            items(DataModel().allAnimals()){
                animalCard -> (GridTiles(animalCard = animalCard))
            }
        }
    )
}
