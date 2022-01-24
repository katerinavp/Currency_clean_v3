package com.petukhova.data

import android.util.Log
import com.petukhova.api.Api
import com.petukhova.domain.model.DomainCurrency
import com.petukhova.domain.repository.CurrencyRepository
import com.petukhova.mappers.CurrencyModelMapper
import io.reactivex.Single

class CurrencyRepositoryImpl (private val api : Api, private val currencyModelMapper : CurrencyModelMapper) : CurrencyRepository {


    override fun getCurrencyFromNetwork(): Single<Map<String, List<DomainCurrency>>> {
        Log.i("serv)", "etCurrencyFromNetwork() ")
        return api.getCurrency().map(currencyModelMapper::map)

    }

}