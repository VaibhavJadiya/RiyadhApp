package com.printoverit.riyadhapp.dataclasses


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("shows")
    val shows: List<Show>
)