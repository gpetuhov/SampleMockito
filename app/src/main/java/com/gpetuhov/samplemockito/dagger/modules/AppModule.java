package com.gpetuhov.samplemockito.dagger.modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.gpetuhov.samplemockito.SampleMockitoApp;
import com.gpetuhov.samplemockito.dagger.scopes.DataScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @DataScope
    Context providesContext() {
        return SampleMockitoApp.getApplication().getApplicationContext();
    }

    @Provides
    @DataScope
    SharedPreferences providesPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
