package com.petukhova.domain.interactor

import android.util.Log
import com.petukhova.domain.model.DomainCurrencyModel
import com.petukhova.domain.model.DomainCurrencyNetwork
import com.petukhova.domain.repository.CurrencyRepository
import io.reactivex.Single

class CurrencyInteractor(private val currencyRepository: CurrencyRepository) {
    fun getCurrency(): Single<List<DomainCurrencyNetwork>> {
        Log.i("serv", "CurrencyInteractor")
    return currencyRepository.getCurrencyFromNetwork()
    }

}