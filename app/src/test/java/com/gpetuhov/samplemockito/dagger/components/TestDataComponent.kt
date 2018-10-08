package com.gpetuhov.samplemockito.dagger.components

import com.gpetuhov.samplemockito.PrefsUtilsTest
import com.gpetuhov.samplemockito.dagger.modules.TestAppModule
import com.gpetuhov.samplemockito.dagger.scopes.DataScope
import dagger.Component

// This Dagger's component is used in tests instead of DataComponent

@Component(modules = [TestAppModule::class])
@DataScope
interface TestDataComponent : DataComponent {
    fun inject(prefsUtilsTest: PrefsUtilsTest)
}
