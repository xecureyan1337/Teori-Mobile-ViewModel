package com.example.teori_mobile_viewmode

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = 0

    fun increaseCount() {
        count++
    }
}