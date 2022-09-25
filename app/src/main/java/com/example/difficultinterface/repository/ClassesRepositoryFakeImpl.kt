package com.example.difficultinterface.repository

import com.example.difficultinterface.model.ClassesData

class ClassesRepositoryFakeImpl : ClassesRepository {
    override fun getClasses(): List<ClassesData> {
        return arrayListOf(
            ClassesData(
                name = "History",
                time = "\uD83D\uDD57 8:00 – 8:40",
                icon = "The Shawshank Redemption",
            ),
            ClassesData(
                name = "Geography",
                time = "\uD83D\uDD57 8:50 – 9:30",
                icon = "The Shawshank Redemption",
            ),
            ClassesData(
                name = "Biology",
                time = "\uD83D\uDD57 9:50 – 10:30",
                icon = "The Shawshank Redemption",
            ),
            ClassesData(
                name = "Geometry",
                time = "\uD83D\uDD57 10:50 – 11:30",
                icon = "The Shawshank Redemption",
            ),
            ClassesData(
                name = "Algebra",
                time = "\uD83D\uDD57 11:40 – 12:20",
                icon = "The Shawshank Redemption",
            ),
        )
    }
}