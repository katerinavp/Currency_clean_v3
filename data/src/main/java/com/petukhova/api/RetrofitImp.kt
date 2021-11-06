package com.petukhova.api

import android.util.Log
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.petukhova.data.db.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitImp {

    fun getApi(): Api {

        // конвертация объектовв json
        val converter = GsonConverterFactory.create()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(converter)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        Log.i("Auth go", "Auth go")
        return retrofit.create(Api::class.java)
    }


}

