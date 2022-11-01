package com.example.testingcompose.presentation.home

import androidx.lifecycle.ViewModel

class HomeScreenViewModel(): ViewModel() {

    var totalAmountInBox: Int = 0
    var bettineOwnsToBox: Int = 0
    var michaelOwnsToBox: Int = 0

    fun addFiveToBettine(): Int {
        bettineOwnsToBox = bettineOwnsToBox + 5
        return bettineOwnsToBox
    }

    fun addFiveToMichael(): Int {
        michaelOwnsToBox = michaelOwnsToBox + 5
        return michaelOwnsToBox
    }

    fun showtotalInBox(): Int {
        return bettineOwnsToBox + michaelOwnsToBox
    }


}