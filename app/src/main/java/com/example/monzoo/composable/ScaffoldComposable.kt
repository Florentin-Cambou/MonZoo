package com.example.monzoo.composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun ScaffoldComposable(){
    Scaffold(
        topBar = { TopAppBarComposable() },
        content = { BodyComposable() }
    )
}