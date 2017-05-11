package com.belov.artem.daggertest.components;

import android.app.Application;
import android.content.Context;

import com.belov.artem.daggertest.DemoApplication;
import com.belov.artem.daggertest.di.ApplicationContext;
import com.belov.artem.daggertest.models.DataManager;
import com.belov.artem.daggertest.models.DbHelper;
import com.belov.artem.daggertest.models.SharedPrefsHelper;
import com.belov.artem.daggertest.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by artem on 11.05.17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
