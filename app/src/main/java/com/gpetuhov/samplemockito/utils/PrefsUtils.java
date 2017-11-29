package com.gpetuhov.samplemockito.utils;

import android.content.SharedPreferences;

import com.gpetuhov.samplemockito.SampleMockitoApp;

import javax.inject.Inject;

// Helper class for reading and writing SharedPreferences
// This class will be tested with Mockito
public class PrefsUtils {

    private static final String TEXT_KEY = "text_key";
    private static final String DEFAULT_TEXT = "default_text";

    @Inject SharedPreferences sharedPreferences;

    public PrefsUtils() {
        SampleMockitoApp.getDataComponent().inject(this);
    }

    public String getText() {
        return sharedPreferences.getString(TEXT_KEY, DEFAULT_TEXT);
    }

    public void setText(String value) {
        sharedPreferences
            .edit()
            .putString(TEXT_KEY, value)
            .apply();
    }
}
