package com.printoverit.riyadhapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.printoverit.riyadhapp.repositories.ShowRepository

class ShowViewModelFactory(private val showRepository: ShowRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
      return ShowViewModel(showRepository) as T
    }
}