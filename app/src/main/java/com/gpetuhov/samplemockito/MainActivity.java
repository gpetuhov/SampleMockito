package com.gpetuhov.samplemockito;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleMockitoApp.getDataComponent().inject( this );

        // TODO: Add some class that injects shared prefs and uses them for something
        // TODO: this will be class for testing
        // TODO: Shared prefs must be mocked with Mockito
    }
}
