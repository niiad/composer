package com.niiadotei.composer.onBoarding.plain

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

// In presentation layer - viewModel

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val repository: DataStoreRepository
) : ViewModel() {
    private val _pages: MutableState<List<OnBoardingData>> = mutableStateOf(listOf(
        OnBoardingData.First,
        OnBoardingData.Second,
        OnBoardingData.Third
    ))

    val pages: State<List<OnBoardingData>> = _pages


    fun saveOnBoardingState(completed: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.saveOnBoardingState(completed = completed)
        }
    }

}