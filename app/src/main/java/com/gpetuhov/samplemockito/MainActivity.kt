package com.gpetuhov.samplemockito

import android.os.Bundle
import android.widget.TextView

import com.gpetuhov.samplemockito.utils.PrefsUtils

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var prefsUtils: PrefsUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SampleMockitoApp.dataComponent.inject(this)

        prefsUtils.text = "Some text bla bla bla"

        textView.text = prefsUtils.text

        // TODO: Test PrefUtils
        // TODO: Shared prefs must be mocked with Mockito
    }
}
