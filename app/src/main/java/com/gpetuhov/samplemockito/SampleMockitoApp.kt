package com.gpetuhov.samplemockito

import android.app.Application

import com.gpetuhov.samplemockito.dagger.components.DaggerDataComponent
import com.gpetuhov.samplemockito.dagger.components.DataComponent

class SampleMockitoApp : Application() {

    companion object {
        lateinit var dataComponent: DataComponent
        lateinit var application: SampleMockitoApp
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        dataComponent = DaggerDataComponent.builder().build()
    }
}
