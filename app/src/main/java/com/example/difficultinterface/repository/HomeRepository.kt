package com.example.difficultinterface.repository

import com.example.difficultinterface.model.ClassesData
import com.example.difficultinterface.model.HomeworkData

interface HomeRepository {
    fun getClasses(): List<ClassesData>
    fun getHomework(): List<HomeworkData>
}