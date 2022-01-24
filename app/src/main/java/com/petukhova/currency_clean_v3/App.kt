package com.petukhova.currency_clean_v3

import android.app.Application


class App : Application() {
//    override fun onCreate() {
//        super.onCreate()
//
//        dependencyProvider = object : DependencyProviders {
//            override fun getInteractor(): CurrencyInteractor {
//                return CurrencyInteractor(getRepository())
//            }
//
//            override fun getRepository(): CurrencyRepository {
//                return CurrencyRepositoryImpl(RetrofitImp().getApi(), CurrencyModelMapper())
//            }
//
//        }
        companion object{
            lateinit var appComponent: AppComponent
        }

        override fun onCreate() {
            super.onCreate()
            appComponent =  DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        }


}