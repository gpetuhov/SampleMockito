package com.gpetuhov.samplemockito;

import android.app.Application;

import com.gpetuhov.samplemockito.dagger.components.DaggerDataComponent;
import com.gpetuhov.samplemockito.dagger.components.DataComponent;

public class SampleMockitoApp extends Application {

    private static DataComponent dataComponent;
    private static SampleMockitoApp sampleMockitoApp;

    @Override
    public void onCreate() {
        super.onCreate();

        sampleMockitoApp = this;

        dataComponent = DaggerDataComponent.builder()
                .build();
    }

    public static DataComponent getDataComponent() {
        return dataComponent;
    }

    public static SampleMockitoApp getApplication() {
        return sampleMockitoApp;
    }
}
