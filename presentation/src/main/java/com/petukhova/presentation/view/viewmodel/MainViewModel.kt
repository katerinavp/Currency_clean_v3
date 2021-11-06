package com.petukhova.presentation.view.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.domain.model.DomainCurrencyNetwork
import com.petukhova.presentation.view.BaseViewModel
import com.petukhova.presentation.view.Resource
import com.petukhova.presentation.view.Status
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel( private val currencyInteractor: CurrencyInteractor): BaseViewModel() {
    private val _domainCurrencyModel: MutableLiveData<Resource<List<DomainCurrencyNetwork>>> by lazy {
        MutableLiveData<Resource<List<DomainCurrencyNetwork>>>()
    }
//    private val currencyMapper = CurrencyModelMapper()
//    val domainCurrencyModel: LiveData<Resource<List<DomainCurrencyNetwork>>> = _domainCurrencyModel
    fun getCurrencyLiveData(): LiveData<Resource<List<DomainCurrencyNetwork>>> = _domainCurrencyModel

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
                _domainCurrencyModel.value = Resource(Status.SUCCESS, it, "")
            }, {
                _domainCurrencyModel.value = Resource(Status.ERROR, null, it.message)
//                    logException(this, it)
            })
        )
    }

}