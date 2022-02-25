package com.printoverit.riyadhapp.api

import com.printoverit.riyadhapp.dataclasses.RootDataClass
import retrofit2.Response
import retrofit2.http.GET

interface ShowAPI {

    @GET("185aa089-ed5e-4a69-99d1-f704e10ed2b5")
    suspend fun getShows():Response<RootDataClass>

    @GET("873fabbd-c88d-4537-84cd-57bbbcd31284")
    suspend fun getHindiShows():Response<RootDataClass>

    @GET("ab6d2264-176f-435e-bf71-e2b09d2349e5")
    suspend fun getJapaneseShows():Response<RootDataClass>

    @GET("444e5631-f53a-4699-9d38-2729678a31ea")
    suspend fun getKoreanShows():Response<RootDataClass>
}