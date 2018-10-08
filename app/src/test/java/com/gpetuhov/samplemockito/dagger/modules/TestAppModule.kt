package com.gpetuhov.samplemockito.dagger.modules

import android.content.SharedPreferences
import com.gpetuhov.samplemockito.dagger.scopes.DataScope
import com.gpetuhov.samplemockito.utils.PrefsUtils
import dagger.Module
import dagger.Provides
import org.mockito.Mockito

@Module
class TestAppModule {

    @Provides
    @DataScope
    fun providesPrefs(): SharedPreferences {
        val sharedPreferences = Mockito.mock(SharedPreferences::class.java)

        // TODO: implement "when" here

        return sharedPreferences
    }

    @Provides
    @DataScope
    fun providesPrefsUtils(sharedPreferences: SharedPreferences): PrefsUtils {
        return PrefsUtils(sharedPreferences)
    }
}