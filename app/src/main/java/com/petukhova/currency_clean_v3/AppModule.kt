package com.petukhova.currency_clean_v3

import android.content.Context
import com.petukhova.api.Api
import com.petukhova.api.RetrofitImp
import com.petukhova.data.CurrencyRepositoryImpl
import com.petukhova.domain.repository.CurrencyRepository
import com.petukhova.mappers.CurrencyModelMapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {

    @Provides
    @Singleton
    fun provideCurrencyRepository(): CurrencyRepository {
        return CurrencyRepositoryImpl(provideApi(), provideCurrencyModelMapper() )
    }

    @Provides
    @Singleton
    fun provideApi(): Api {
        return RetrofitImp().getApi()
    }

    @Provides
    @Singleton
    fun provideCurrencyModelMapper(): CurrencyModelMapper {
        return CurrencyModelMapper()
    }


}