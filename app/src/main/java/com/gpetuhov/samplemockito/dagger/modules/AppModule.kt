package com.gpetuhov.samplemockito.dagger.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

import com.gpetuhov.samplemockito.SampleMockitoApp
import com.gpetuhov.samplemockito.dagger.scopes.DataScope
import com.gpetuhov.samplemockito.utils.PrefsUtils

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    @DataScope
    fun providesContext(): Context {
        return SampleMockitoApp.application.applicationContext
    }

    @Provides
    @DataScope
    fun providesPrefs(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @DataScope
    fun providesPrefsUtils(sharedPreferences: SharedPreferences): PrefsUtils {
        return PrefsUtils(sharedPreferences)
    }
}
