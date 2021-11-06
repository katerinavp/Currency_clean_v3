//import com.petukhova.domain.model.DomainCurrencyModel
//import com.petukhova.domain.model.DomainCurrencyNetwork
//
//
//class CurrencyModelMapper {
//    private val contentItemsList=  mutableListOf<DomainCurrencyNetwork>()
//    fun map(currency: DomainCurrencyModel): List<DomainCurrencyNetwork> {
//
//        for (currencyModel in currency.valute) {
//
//            val currencyItem = DomainCurrencyNetwork(
//
//                id = currencyModel.value.id,
//                charCode = currencyModel.value.charCode,
//                name = currencyModel.value.name,
//                numCode = currencyModel.value.numCode,
//                previous = currencyModel.value.previous,
//                value = currencyModel.value.value,
//                nominal = currencyModel.value.nominal,
//            )
//            contentItemsList.add(currencyItem)
//        }
//            return contentItemsList
////        return convertToSkipMonthItems(monthContentItemsMap.toSortedMap(compareByDescending
////        { it }))
//
//        }
//
//}