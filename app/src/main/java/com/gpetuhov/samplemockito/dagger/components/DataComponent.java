package com.gpetuhov.samplemockito.dagger.components;

import com.gpetuhov.samplemockito.dagger.modules.AppModule;
import com.gpetuhov.samplemockito.dagger.scopes.DataScope;
import com.gpetuhov.samplemockito.utils.PrefsUtils;

import dagger.Component;

@Component(modules = AppModule.class)
@DataScope
public interface DataComponent {
    void inject(PrefsUtils prefsUtils);
}
