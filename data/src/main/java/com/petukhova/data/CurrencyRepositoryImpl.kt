package com.petukhova.data

import CurrencyModelMapper
import android.util.Log
import com.petukhova.api.RetrofitService
import com.petukhova.domain.model.DomainCurrencyModel
import com.petukhova.domain.model.DomainCurrencyNetwork
import com.petukhova.domain.repository.CurrencyRepository
import io.reactivex.Single

class CurrencyRepositoryImpl : CurrencyRepository {
    private val apiService = RetrofitService()
    val currencyModelMapper = CurrencyModelMapper()

    override fun getCurrencyFromNetwork(): Single<List<DomainCurrencyNetwork>> {
        Log.i("serv)", "etCurrencyFromNetwork() ")
        return apiService.getData().map(currencyModelMapper::map)

    }

}