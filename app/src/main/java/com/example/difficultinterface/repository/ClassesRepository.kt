package com.example.difficultinterface.repository

import com.example.difficultinterface.model.ClassesData

interface ClassesRepository {
    fun getClasses(): List<ClassesData>
}