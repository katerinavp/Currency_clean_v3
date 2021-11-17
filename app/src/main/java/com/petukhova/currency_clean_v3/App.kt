package com.petukhova.currency_clean_v3

import android.app.Application
import com.petukhova.api.RetrofitImp
import com.petukhova.data.CurrencyRepositoryImpl
import com.petukhova.domain.dependencyprovider.DependencyProviders
import com.petukhova.domain.dependencyprovider.dependencyProvider
import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.domain.repository.CurrencyRepository
import com.petukhova.mappers.CurrencyModelMapper


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        dependencyProvider = object : DependencyProviders {
            override fun getInteractor(): CurrencyInteractor {
                return CurrencyInteractor(getRepository())
            }

            override fun getRepository(): CurrencyRepository {
                return CurrencyRepositoryImpl(RetrofitImp().getApi(), CurrencyModelMapper())
            }

        }
    }
}