package com.belov.artem.daggertest.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.belov.artem.daggertest.di.ApplicationContext;
import com.belov.artem.daggertest.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
