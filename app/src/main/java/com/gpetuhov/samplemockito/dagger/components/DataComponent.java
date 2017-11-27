package com.gpetuhov.samplemockito.dagger.components;

import com.gpetuhov.samplemockito.MainActivity;
import com.gpetuhov.samplemockito.dagger.modules.AppModule;
import com.gpetuhov.samplemockito.dagger.scopes.DataScope;

import dagger.Component;

@Component(modules = AppModule.class)
@DataScope
public interface DataComponent {
    void inject(MainActivity activity);
}
