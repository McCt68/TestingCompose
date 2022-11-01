package com.example.testingcompose.presentation.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testingcompose.ui.theme.myBlue
import com.example.testingcompose.ui.theme.myBlueBlack

@Composable
fun HomeScreenTwo(viewModel: HomeScreenViewModel = HomeScreenViewModel()) {

    var totalAmountInBox = remember {
        mutableStateOf(0)
    }

    var bettineOwnsToBox = remember {
        mutableStateOf(0)
    }

    var michaelOwnsToBox = remember {
        mutableStateOf(0)
    }


    Surface(modifier = Modifier.fillMaxSize(), color = myBlueBlack) {
        Column(modifier = Modifier.fillMaxSize()) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(8.dp),
                backgroundColor = myBlue,
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Totalt beløb i bandekassen.", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Text(text = "${totalAmountInBox.value.toString()} Kr.", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }

            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(8.dp),
                backgroundColor = myBlue,
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Bettine Skylder ${bettineOwnsToBox.value} Kr."
                        , fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Michael Skylder ${michaelOwnsToBox.value} Kr."
                        , fontSize = 22.sp, fontWeight = FontWeight.Bold)

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = {bettineOwnsToBox.value = viewModel.addFiveToBettine()},
                    modifier = Modifier.size(width = 160.dp, height = 60.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(2.dp, color = myBlue)
                ) {
                    Text(text = "Bettine + 5", fontSize = 22.sp)

                }
                Button(
                    onClick = { michaelOwnsToBox.value = viewModel.addFiveToMichael() },
                    modifier = Modifier.size(width = 160.dp, height = 60.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(2.dp, color = myBlue)
                ) {
                    Text(text = "Michael + 5", fontSize = 22.sp)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(
                    onClick = { totalAmountInBox.value = viewModel.showtotalInBox() },
                    modifier = Modifier.size(width = 200.dp, height = 60.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(2.dp, color = myBlue)
                ) {
                    Text(text = "Opdater beløb", fontSize = 22.sp)
                }
            }
        }

    }
}