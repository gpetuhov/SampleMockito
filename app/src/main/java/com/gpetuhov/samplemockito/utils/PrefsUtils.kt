package com.gpetuhov.samplemockito.utils

import android.content.SharedPreferences

import com.gpetuhov.samplemockito.SampleMockitoApp

import javax.inject.Inject

// Helper class for reading and writing SharedPreferences
// This class will be tested with Mockito
class PrefsUtils(private val sharedPreferences: SharedPreferences) {

    companion object {
        const val TEXT_KEY = "text_key"
        const val DEFAULT_TEXT = "default_text"
    }

    var text: String?
        get() = sharedPreferences.getString(TEXT_KEY, DEFAULT_TEXT)
        set(value) = sharedPreferences
                .edit()
                .putString(TEXT_KEY, value)
                .apply()
}
