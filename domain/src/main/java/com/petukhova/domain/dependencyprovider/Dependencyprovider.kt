package com.petukhova.domain.dependencyprovider

import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.domain.repository.CurrencyRepository

lateinit var dependencyProvider: DependencyProviders

interface DependencyProviders {
    fun getInteractor(): CurrencyInteractor

    fun getRepository(): CurrencyRepository

}