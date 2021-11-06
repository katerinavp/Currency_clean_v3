package com.petukhova.api

import android.util.Log
import com.petukhova.data.model.CurrencyNetwork
import com.petukhova.data.model.ModelResponseNetwork
import io.reactivex.Single

class RetrofitService {

    private val api: Api = RetrofitImp().getApi()

    fun getData(): Single<ModelResponseNetwork> {
        Log.i("serv", "RetrofitService ")
        return api.getCurrency()
    }
}
