package com.example.testingcompose

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testingcompose.presentation.home.HomeScreen
import com.example.testingcompose.presentation.home.HomeScreenTwo
import com.example.testingcompose.ui.theme.TestingComposeTheme
import com.example.testingcompose.ui.theme.myBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestingComposeTheme {
                // MainScreen()
                Surface(color = Color.LightGray) {
                    // HomeScreen()
                    HomeScreenTwo()
                }

            }
        }
    }
}

@Composable
fun MainScreen(){
    // A surface container
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.primary
    ) {
        Column (
            modifier = Modifier.padding(16.dp)

        ){
            ButtonComposable()
            ButtonComposable()
        }
    }
}

@Composable
fun ButtonComposable(/*context: Context*/) {
    val buttonColorState = remember {
        mutableStateOf(true)
    }
        Button(
            onClick = {
                buttonColorState.value = !buttonColorState.value // change to opposite value when clicked
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (buttonColorState.value) colors.primaryVariant else colors.secondary,
                contentColor = Color.White
            ),
            modifier = Modifier
                .padding(8.dp)
                .width(180.dp)
                .height(53.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(text = "Click Me")

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestingComposeTheme {
        MainScreen()

    }
}