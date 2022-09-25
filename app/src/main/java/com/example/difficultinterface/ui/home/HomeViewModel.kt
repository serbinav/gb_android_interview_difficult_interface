package com.example.difficultinterface.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.difficultinterface.model.ClassesData
import com.example.difficultinterface.repository.ClassesRepositoryFakeImpl

class HomeViewModel : ViewModel() {

    private val _data = MutableLiveData<List<ClassesData>>().apply {
        value = ClassesRepositoryFakeImpl().getClasses()
    }
    val data: LiveData<List<ClassesData>> = _data
}