package com.printoverit.riyadhapp.dataclasses


import com.google.gson.annotations.SerializedName

data class RootDataClass(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean
)