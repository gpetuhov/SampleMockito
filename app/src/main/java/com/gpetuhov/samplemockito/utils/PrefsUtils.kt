package com.gpetuhov.samplemockito.utils

import android.content.SharedPreferences

import com.gpetuhov.samplemockito.SampleMockitoApp

import javax.inject.Inject

// Helper class for reading and writing SharedPreferences
// This class will be tested with Mockito
class PrefsUtils {

    companion object {
        private const val TEXT_KEY = "text_key"
        private const val DEFAULT_TEXT = "default_text"
    }

    init {
        SampleMockitoApp.dataComponent.inject(this)
    }

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    var text: String?
        get() = sharedPreferences.getString(TEXT_KEY, DEFAULT_TEXT)
        set(value) = sharedPreferences
                .edit()
                .putString(TEXT_KEY, value)
                .apply()
}
