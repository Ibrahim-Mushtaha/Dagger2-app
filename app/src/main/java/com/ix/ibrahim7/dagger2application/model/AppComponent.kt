package com.ix.ibrahim7.dagger2application.model

import com.ix.ibrahim7.dagger2application.network.RetrofitModule
import com.ix.ibrahim7.dagger2application.network.NetComponent
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RiverModule::class, RetrofitModule::class])
interface AppComponent {

    /*fun getRiver(): River*/
    fun getCoffeeComponentBuilder():CoffeeComponent.Builder
    fun getNetComponent(): NetComponent.Builder


}