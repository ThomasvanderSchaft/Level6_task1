package com.example.advancedrecyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advancedrecyclerview.data.ColorItem

class MainActivityViewModel : ViewModel(){
    private val colorRepo = ColorRepo()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepo.getColorItems()
    }
}
