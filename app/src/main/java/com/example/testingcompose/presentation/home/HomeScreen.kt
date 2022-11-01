package com.example.testingcompose.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.testingcompose.presentation.home.components.BettinePlusFive
import com.example.testingcompose.presentation.home.components.BettineSkylder
import com.example.testingcompose.presentation.home.components.MicaelSkylder
import com.example.testingcompose.presentation.home.components.ShowTotal

@Composable
fun HomeScreen(viewModel: HomeScreenViewModel = HomeScreenViewModel()) {
    Surface(
        modifier = Modifier
            //.fillMaxSize()
            .padding(8.dp),
        //color = Color.Red,
        // contentColor = Color.Green
    ) {
        Column {
            ShowTotal()
            BettineSkylder(bettineOweamount = "25 kr.")
            MicaelSkylder(michaelOweamount = "15 Kr.")
            Row() {
                BettinePlusFive()
            }

        }

    }
}