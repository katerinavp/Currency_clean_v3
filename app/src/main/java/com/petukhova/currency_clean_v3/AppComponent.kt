package com.petukhova.currency_clean_v3

import android.content.Context
import android.content.res.Resources
import com.petukhova.data.CurrencyRepositoryImpl
import com.petukhova.domain.dependencyprovider.DependencyProviders
import com.petukhova.domain.interactor.CurrencyInteractor
import com.petukhova.domain.repository.CurrencyRepository
import dagger.*
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    val context: Context

    val resourceManager: Resources

    @Component.Factory
    interface Builder {
        fun build(
            @BindsInstance context: Context,
            @BindsInstance resource: Resources,
            appModule: AppModule
        ): AppComponent
    }
}
@Module(includes = [AppModule.Bindings::class])
class AppModule {

    @Provides
    fun provideActionsInteractor(
        currencyRepository: CurrencyRepository
    ): CurrencyInteractor {
        return CurrencyInteractor(
            currencyRepository = currencyRepository
        )
    }

    @Module
    interface Bindings {
        @Binds
        fun bindActionsRepository(currencyRepositoryImpl: CurrencyRepositoryImpl): CurrencyRepository
    }
}

