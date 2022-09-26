package com.example.difficultinterface.repository

import com.example.difficultinterface.model.ClassesData
import com.example.difficultinterface.model.HomeworkData

class HomeRepositoryFakeImpl : HomeRepository {
    override fun getClasses(): List<ClassesData> {
        return arrayListOf(
            ClassesData(
                name = "History",
                time = "\uD83D\uDD57 8:00 – 8:40",
                icon = "path",
            ),
            ClassesData(
                name = "Geography",
                time = "\uD83D\uDD57 8:50 – 9:30",
                icon = "path",
            ),
            ClassesData(
                name = "Biology",
                time = "\uD83D\uDD57 9:50 – 10:30",
                icon = "path",
            ),
            ClassesData(
                name = "Geometry",
                time = "\uD83D\uDD57 10:50 – 11:30",
                icon = "path",
            ),
            ClassesData(
                name = "Algebra",
                time = "\uD83D\uDD57 11:40 – 12:20",
                icon = "path",
            ),
        )
    }

    override fun getHomework(): List<HomeworkData> {
        return arrayListOf(
            HomeworkData(
                name = "Literature",
                time = "2 days left",
                bigIcon = "path",
                description = "Read scene 1.1-1.12 of The Master and Margarita.",
                boys = true,
                girls = true,
            ),
            HomeworkData(
                name = "Physics",
                time = "5 days left",
                bigIcon = "path",
                description = "Learn Newton's laws of motion",
                boys = true,
                girls = true,
            ),
            HomeworkData(
                name = "Biology",
                time = "7 days left",
                bigIcon = "path",
                description = "Draw the structure of a human cell",
                boys = false,
                girls = true,
            ),
            HomeworkData(
                name = "Geometry",
                time = "7 days left",
                bigIcon = "path",
                description = "Learn the law of Pythagoras",
                boys = true,
                girls = false,
            ),
            HomeworkData(
                name = "Algebra",
                time = "7 days left",
                bigIcon = "path",
                description = "Perform an action: a) 4.2-8, b)-2.4+5.6 c) 38/(-0.19)",
                boys = true,
                girls = true,
            ),
        )
    }
}