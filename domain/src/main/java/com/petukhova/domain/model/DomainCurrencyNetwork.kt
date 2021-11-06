package com.petukhova.domain.model

data class DomainCurrencyNetwork(
    val date: String,
    val id: String,
    val numCode: Int,
    val charCode: String,
    val nominal: Int,
    val name: String,
    val value: Double,
    val previous: Double
)