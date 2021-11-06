import com.petukhova.data.model.ModelResponseNetwork
import com.petukhova.domain.model.DomainCurrencyModel
import com.petukhova.domain.model.DomainCurrencyNetwork


class CurrencyModelMapper {
    private val contentItemsModel=  mutableListOf<DomainCurrencyNetwork>()

    fun map(currency: ModelResponseNetwork): List<DomainCurrencyNetwork>{

        for (currencyModel in currency.valute) {

            val currencyItem = DomainCurrencyNetwork(
                date = currency.date,
                id = currencyModel.value.id,
                charCode = currencyModel.value.charCode,
                name = currencyModel.value.name,
                numCode = currencyModel.value.numCode,
                previous = currencyModel.value.previous,
                value = currencyModel.value.value,
                nominal = currencyModel.value.nominal,
            )
//            contentItemsList.add(currency.date, currency.previousDate, currency.previousURL, currency.timestamp, currency.date, currency.previousDate, currencyItem)
            contentItemsModel.add(currencyItem)
        }
//        contentItemsList.add(DomainCurrencyModel(currency.date, currency.previousDate, currency.previousURL, currency.timestamp, map(String,contentItemsModel)))

            return contentItemsModel
//        return convertToSkipMonthItems(monthContentItemsMap.toSortedMap(compareByDescending
//        { it }))

        }

}