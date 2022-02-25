package com.printoverit.riyadhapp.repositories

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.printoverit.riyadhapp.dataclasses.RootDataClass
import com.printoverit.riyadhapp.utils.NetworkStatus.Companion.isNetworkAvailable

class ShowRepository(private val remoteDataSoruce: RemoteDataSoruce  , private val context: Context) {

    var mutableLiveData: MutableLiveData<RootDataClass> = MutableLiveData()
    val liveData: LiveData<RootDataClass>
        get() = mutableLiveData

    suspend fun loadShows(){
        if(isNetworkAvailable(context)){
            if (remoteDataSoruce.getShows().body()!=null){
                mutableLiveData.postValue(remoteDataSoruce.getShows().body())
            }
        }
        else{
            Log.d("TAG", "Internet Not Available")
        }
    }

    suspend fun loadJapaneseShows(){
        if(isNetworkAvailable(context)){
            if (remoteDataSoruce.getJapaneseShows().body()!=null){
                mutableLiveData.postValue(remoteDataSoruce.getJapaneseShows().body())
            }
        }
        else{
            Log.d("TAG", "Internet Not Available")
        }
    }

    suspend fun loadKoreanShows(){
        if(isNetworkAvailable(context)){
            if (remoteDataSoruce.getKoreanShows().body()!=null){
                mutableLiveData.postValue(remoteDataSoruce.getKoreanShows().body())
            }
        }
        else{
            Log.d("TAG", "Internet Not Available")
        }
    }

    suspend fun loadHindiShows(){
        if(isNetworkAvailable(context)){
            if (remoteDataSoruce.getHindiShows().body()!=null){
                mutableLiveData.postValue(remoteDataSoruce.getHindiShows().body())
            }
        }
        else{
            Log.d("TAG", "Internet Not Available")
        }
    }

}