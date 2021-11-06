package com.petukhova.domain.model

data class DomainCurrencyModel(
    val date: String,
    val previousDate: String,
    val previousURL: String,
    val timestamp: String,
    val valute: Map<String, DomainCurrencyNetwork>
)
