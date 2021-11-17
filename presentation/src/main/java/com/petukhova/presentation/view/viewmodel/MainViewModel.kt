package com.petukhova.presentation.view.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.domain.model.DomainCurrency
import com.petukhova.presentation.view.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel( private val currencyInteractor: CurrencyInteractor): BaseViewModel() {
    private val _domainCurrencyModel: MutableLiveData<Map<String, List<DomainCurrency>>> by lazy {
        MutableLiveData<Map<String, List<DomainCurrency>>>()
    }

    fun getCurrencyLiveData(): LiveData<Map<String, List<DomainCurrency>>> = _domainCurrencyModel

//    init {
//        getCurreny()
//    }

    fun getCurreny() {
        compositeDisposable.add(
        currencyInteractor.getCurrency()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
//            .doOnSubscribe { _domainCurrencyModel.value = Resource(Status.LOADING, null, null) }
//            .map(currencyMapper::map)

            .subscribe({
                Log.i("subscribe ViewModel", "$it")
                _domainCurrencyModel.value =  it
            }, {
                _domainCurrencyModel.value = null
//                    logException(this, it)
            })
        )
    }

}