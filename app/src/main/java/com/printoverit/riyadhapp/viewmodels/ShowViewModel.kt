package com.printoverit.riyadhapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.printoverit.riyadhapp.dataclasses.RootDataClass
import com.printoverit.riyadhapp.repositories.ShowRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShowViewModel(private val repository: ShowRepository):ViewModel() {

    fun loadMutableData(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.loadShows()
        }
    }
    fun loadJapaneseMutableData(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.loadJapaneseShows()
        }
    }
    fun loadKoreanMutableData(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.loadKoreanShows()
        }
    }
    fun loadHindiMutableData(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.loadHindiShows()
        }
    }

    fun getLiveData():LiveData<RootDataClass>{
        return repository.liveData
    }

}