package com.belov.artem.daggertest.components;

import com.belov.artem.daggertest.MainActivity;
import com.belov.artem.daggertest.di.PerActivity;
import com.belov.artem.daggertest.modules.ActivityModule;

import dagger.Component;

/**
 * Created by artem on 11.05.17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
