package com.example.difficultinterface.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClassesData constructor(
    var name: String,
    var time: String,
    var icon: String,
) : Parcelable