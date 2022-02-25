package com.printoverit.riyadhapp.utils

import android.app.Application
import com.printoverit.riyadhapp.api.ShowAPI
import com.printoverit.riyadhapp.repositories.RemoteDataSoruce
import com.printoverit.riyadhapp.repositories.ShowRepository
import retrofit2.create

class MyApplication:Application() {

    lateinit var repository: ShowRepository
    override fun onCreate() {
        super.onCreate()
        val api=RetrofitInstance.getRetrofitInstance().create(ShowAPI::class.java)
        val remoteData=RemoteDataSoruce(api)
        repository=ShowRepository(remoteData,applicationContext)
    }
}