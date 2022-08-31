package com.niiadotei.composer.onBoarding.layered

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niiadotei.composer.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val repository: DataStoreRepository
) : ViewModel() {
    private val _onBoardingItems: MutableState<List<OnBoardingData>> = mutableStateOf(listOf(
        OnBoardingData(
            image = R.drawable.first,
            mainColor = Color(0xFFD3997F),
            header = "Minion at your command",
            message = "Let Minion manage your business products, supply chains, customers, " +
                    "expenditures and revenues while you focus on the important things."
        ),
        OnBoardingData(
            image = R.drawable.second,
            mainColor = Color(0xFF24574E),
            header = "Search products and suppliers",
            message = "Stay ahead of your competition by searching various products at various " +
                    "prices to provide your customers with ready freshly delivered products."
        ),
        OnBoardingData(
            image = R.drawable.third,
            mainColor = Color(0xFFD3997F),
            header = "Market your own products",
            message = "Create your own products and connect with distributors, retailers and sellers" +
                    " who will drive your products to your customers."
        )
    ))

    val onBoardingItems: State<List<OnBoardingData>> = _onBoardingItems

    fun saveOnBoardingState(completed: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.saveOnBoardingState(completed = completed)
        }
    }

}