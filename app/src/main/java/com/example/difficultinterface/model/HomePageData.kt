package com.example.difficultinterface.model

data class HomePageData constructor(
    var classes: List<ClassesData>,
    var homework: List<HomeworkData>,
)

data class ClassesData constructor(
    var name: String,
    var time: String,
    var icon: String,
)

data class HomeworkData constructor(
    var name: String,
    var time: String,
    var bigIcon: String,
    var description: String,
    var boys: Boolean,
    var girls: Boolean,
)