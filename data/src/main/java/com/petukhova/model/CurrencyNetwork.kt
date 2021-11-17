package com.petukhova.model

import com.google.gson.annotations.SerializedName
//import com.petukhova.data.entity.Currency

data class CurrencyNetwork( // то что приходит из сервера
    @SerializedName("ID")
    val id: String,
    @SerializedName("NumCode")
    val numCode: Int,
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("Nominal")
    val nominal: Int,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Value")
    val value: Double,
    @SerializedName("Previous")
    val previous: Double
) {

    //Декларация объекта внутри класса может быть помечена ключевым словом:companion
    //несмотря на то, что члены объектов-компаньонов выглядят как статические участники на других языках,
    // во время выполнения они по-прежнему являются членами реальных объектов и могут, например, реализовывать интерфейсы:
    //то что отправляем в БД
//    companion object {
//        fun CurrencyNetwork.toFormatInDB(): Currency {
//            return Currency(
//                id = this.id,
//                numCode = this.numCode,
//                charCode = this.charCode,
//                nominal = this.nominal,
//                name = this.name,
//                value = this.value,
//                previous = this.previous
//            )
//        }
//    }
}