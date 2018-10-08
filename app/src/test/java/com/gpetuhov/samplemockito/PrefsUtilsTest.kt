package com.gpetuhov.samplemockito

import com.gpetuhov.samplemockito.dagger.components.DaggerTestDataComponent
import org.junit.Before
import com.gpetuhov.samplemockito.utils.PrefsUtils
import org.junit.Assert.assertEquals
import org.junit.Test
import javax.inject.Inject


// Here we test PrefsUtils class.
// But it uses Android SharedPreferences,
// so for this test to run on JVM, SharedPreferences must be mocked.
class PrefsUtilsTest {

    companion object {
        const val DUMMY_TEXT = "Dummy text"
    }

    @Inject
    lateinit var prefsUtils: PrefsUtils

    @Before
    fun init() {
        val testDataComponent = DaggerTestDataComponent.builder().build()
        testDataComponent.inject(this)
    }

    @Test
    fun checkText() {
        assertEquals(DUMMY_TEXT, prefsUtils.text)

        // Note that our mocked preferences do not save new text value
        prefsUtils.text = "dsdsfdsf"
        assertEquals(DUMMY_TEXT, prefsUtils.text)
    }
}