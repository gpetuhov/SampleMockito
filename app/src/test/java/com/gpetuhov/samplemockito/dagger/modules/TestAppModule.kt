package com.gpetuhov.samplemockito.dagger.modules

import android.content.SharedPreferences
import com.gpetuhov.samplemockito.dagger.scopes.DataScope
import com.gpetuhov.samplemockito.utils.PrefsUtils
import dagger.Module
import dagger.Provides
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito

// This Dagger module is used in tests instead of AppModule

@Module
class TestAppModule {

    companion object {
        const val DUMMY_TEXT = "Dummy text"
    }

    @Provides
    @DataScope
    fun providesPrefs(): SharedPreferences {
        // Here we mock SharedPreferences with Mockito
        val sharedPreferences = Mockito.mock(SharedPreferences::class.java)
        val editor = Mockito.mock(SharedPreferences.Editor::class.java)

        Mockito.`when`(sharedPreferences.getString(PrefsUtils.TEXT_KEY, PrefsUtils.DEFAULT_TEXT))
                .thenReturn(DUMMY_TEXT)

        Mockito.`when`(sharedPreferences.edit()).thenReturn(editor)
        Mockito.`when`(editor.putString(any(String::class.java), any(String::class.java))).thenReturn(editor)
        Mockito.`when`(editor.apply()).then { /* Do nothing */ }

        return sharedPreferences
    }

    @Provides
    @DataScope
    fun providesPrefsUtils(sharedPreferences: SharedPreferences): PrefsUtils {
        return PrefsUtils(sharedPreferences)
    }
}