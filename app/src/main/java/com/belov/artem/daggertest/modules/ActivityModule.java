package com.belov.artem.daggertest.modules;

import android.app.Activity;
import android.content.Context;

import com.belov.artem.daggertest.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
