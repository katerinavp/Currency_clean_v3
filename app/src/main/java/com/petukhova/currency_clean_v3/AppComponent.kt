package com.petukhova.currency_clean_v3

import com.petukhova.presentation.view.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    // Classes that can be injected by this Component
    fun inject(mainActivity: MainActivity)
}