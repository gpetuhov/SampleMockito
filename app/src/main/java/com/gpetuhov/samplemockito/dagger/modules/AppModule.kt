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
    internal fun providesContext(): Context {
        return SampleMockitoApp.application.applicationContext
    }

    @Provides
    @DataScope
    internal fun providesPrefs(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @DataScope
    internal fun providesPrefsUtils(): PrefsUtils {
        return PrefsUtils()
    }
}
