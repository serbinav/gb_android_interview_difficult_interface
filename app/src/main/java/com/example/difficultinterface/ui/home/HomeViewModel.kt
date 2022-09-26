package com.example.difficultinterface.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.difficultinterface.model.HomePageData
import com.example.difficultinterface.repository.HomeRepositoryFakeImpl

class HomeViewModel : ViewModel() {

    private val _data = MutableLiveData<HomePageData>().apply {
        value = HomePageData(
            HomeRepositoryFakeImpl().getClasses(),
            HomeRepositoryFakeImpl().getHomework()
        )
    }
    val data: LiveData<HomePageData> = _data
}