package com.gpetuhov.samplemockito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gpetuhov.samplemockito.utils.PrefsUtils;

public class MainActivity extends AppCompatActivity {

    private PrefsUtils prefsUtils;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefsUtils = new PrefsUtils();

        prefsUtils.setText( "Some text bla bla bla" );

        textView = findViewById( R.id.textview );

        textView.setText( prefsUtils.getText() );

        // TODO: Test PrefUtils
        // TODO: Shared prefs must be mocked with Mockito
    }
}
