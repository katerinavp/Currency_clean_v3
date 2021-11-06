package com.petukhova.domain.repository

import com.petukhova.domain.model.DomainCurrencyModel
import com.petukhova.domain.model.DomainCurrencyNetwork
import io.reactivex.Single

interface CurrencyRepository {
   fun getCurrencyFromNetwork(): Single<List<DomainCurrencyNetwork>>
}