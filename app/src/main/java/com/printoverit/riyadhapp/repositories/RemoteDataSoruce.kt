package com.printoverit.riyadhapp.repositories

import com.printoverit.riyadhapp.api.ShowAPI
import com.printoverit.riyadhapp.dataclasses.RootDataClass
import retrofit2.Response

class RemoteDataSoruce(private val showAPI: ShowAPI) {

    suspend fun getShows():Response<RootDataClass>{
        return  showAPI.getShows()
    }
    suspend fun getJapaneseShows():Response<RootDataClass>{
        return  showAPI.getJapaneseShows()
    }
    suspend fun getKoreanShows():Response<RootDataClass>{
        return  showAPI.getKoreanShows()
    }
    suspend fun getHindiShows():Response<RootDataClass>{
        return  showAPI.getHindiShows()
    }
}