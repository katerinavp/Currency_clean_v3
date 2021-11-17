package com.petukhova.domain.repository

import com.petukhova.domain.model.DomainCurrency
import io.reactivex.Single

interface CurrencyRepository {
   fun getCurrencyFromNetwork(): Single<Map<String, List<DomainCurrency>>> // ключ - дата текущая
}