package com.petukhova.model

import com.google.gson.annotations.SerializedName
import com.petukhova.model.CurrencyNetwork

//формат ответа от сервера
data class ModelResponseNetwork(
    @SerializedName("Date")
    val date: String,
    @SerializedName("PreviousDate")
    val previousDate: String,
    @SerializedName("PreviousURL")
    val previousURL: String,
    @SerializedName("Timestamp")
    val timestamp: String,
    @SerializedName("Valute")
    val valute: Map<String, CurrencyNetwork>
)