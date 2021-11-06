package com.petukhova.presentation.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.petukhova.domain.dependencyprovider.dependencyProvider
import com.petukhova.presentation.view.viewmodel.MainViewModel


object MainFragmentDependencyProvider {

    fun inject(fragment: MainFragment) {
        fragment.viewModel = ViewModelProvider(
            fragment,
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return MainViewModel(dependencyProvider.getInteractor()) as T
                }
            }
        )[MainViewModel::class.java]
    }
}