package com.gpetuhov.samplemockito.dagger.components

import com.gpetuhov.samplemockito.MainActivity
import com.gpetuhov.samplemockito.dagger.modules.AppModule
import com.gpetuhov.samplemockito.dagger.scopes.DataScope
import com.gpetuhov.samplemockito.utils.PrefsUtils

import dagger.Component

@Component(modules = [AppModule::class])
@DataScope
interface DataComponent {
    fun inject(prefsUtils: PrefsUtils)
    fun inject(mainActivity: MainActivity)
}
