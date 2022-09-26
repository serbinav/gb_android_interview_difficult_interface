package com.example.difficultinterface.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomePageData constructor(
    var classes: List<ClassesData>,
    var homework: List<HomeworkData>,
) : Parcelable

@Parcelize
data class ClassesData constructor(
    var name: String,
    var time: String,
    var icon: String,
) : Parcelable

@Parcelize
data class HomeworkData constructor(
    var name: String,
    var time: String,
    var bigIcon: String,
    var description: String,
    var boys: Boolean,
    var girls: Boolean,
) : Parcelable