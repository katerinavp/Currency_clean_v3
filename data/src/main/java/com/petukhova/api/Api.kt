package com.petukhova.api

import com.petukhova.data.model.ModelResponseNetwork
import io.reactivex.Single
import retrofit2.http.GET

interface Api {

//    @GET("daily_json.js")
//   suspend fun getCurrency(): ModelResponseNetwork
    @GET("daily_json.js")
  fun getCurrency(): Single<ModelResponseNetwork>
}