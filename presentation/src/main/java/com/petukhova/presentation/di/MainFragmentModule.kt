package com.petukhova.presentation.di

import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.presentation.view.MainFragment
import com.petukhova.presentation.view.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides

class MainFragmentModule {
    @Module
    class MainFragmentModule {

        @Provides
        fun provideViewModel(
            fragment: MainFragment,
            interactor: CurrencyInteractor
        ): MainViewModel {
            return ViewModelProvider(
                fragment,
                object : ViewModelProvider.Factory {
                    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                        return MainViewModel(interactor) as T
                    }
                }
            )[MainViewModel::class.java]
        }
    }
}