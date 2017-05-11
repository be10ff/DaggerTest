package com.belov.artem.daggertest;

import android.app.Application;
import android.content.Context;

import com.belov.artem.daggertest.components.ApplicationComponent;
import com.belov.artem.daggertest.components.DaggerApplicationComponent;
import com.belov.artem.daggertest.models.DataManager;
import com.belov.artem.daggertest.modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by artem on 11.05.17.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
