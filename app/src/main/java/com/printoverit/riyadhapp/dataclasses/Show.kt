package com.printoverit.riyadhapp.dataclasses


import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("category")
    val category: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("url")
    val url: String
)