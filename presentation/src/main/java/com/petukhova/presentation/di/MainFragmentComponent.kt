package com.petukhova.presentation.di

import com.petukhova.domain.dependencyprovider.DependencyProviders
import com.petukhova.presentation.view.MainFragment
import dagger.BindsInstance
import dagger.Component

@Component(
modules = [MainFragmentModule::class],
dependencies = [DependencyProviders::class]
)
interface MainFragmentComponent {

   fun inject(fragment: MainFragment)

   @Component.Factory
   interface Factory {
      fun create(
         @BindsInstance fragment: MainFragment,
         dependencyProviders: DependencyProviders,
         mainFragmentModule: MainFragmentModule
      ): MainFragmentComponent
   }
}