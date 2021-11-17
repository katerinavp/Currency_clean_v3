package com.petukhova.mappers

import com.petukhova.domain.model.DomainCurrency
import com.petukhova.model.ModelResponseNetwork


class CurrencyModelMapper {

    fun map(currency: ModelResponseNetwork): Map<String, List<DomainCurrency>> { //ключ - дата текущая
        return mapOf(currency.date to currency.valute
            .map { currencyModel ->
                DomainCurrency(
                    codeCurrency = currencyModel.value.charCode,
                    nameCurrency = currencyModel.value.name,
                    valueCurrency = currencyModel.value.value,
                )
            }
        )
    }
}