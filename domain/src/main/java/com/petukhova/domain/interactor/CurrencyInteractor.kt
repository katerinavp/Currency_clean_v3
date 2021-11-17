package com.petukhova.domain.interactor

import android.util.Log
import com.petukhova.domain.model.DomainCurrency
import com.petukhova.domain.repository.CurrencyRepository
import io.reactivex.Single

class CurrencyInteractor(private val currencyRepository: CurrencyRepository) {
    fun getCurrency(): Single<Map<String, List<DomainCurrency>>> {
        Log.i("serv", "CurrencyInteractor")
    return currencyRepository.getCurrencyFromNetwork()
    }

}