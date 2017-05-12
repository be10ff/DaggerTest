package com.belov.artem.daggertest.modules;

import com.belov.artem.daggertest.models.DoomsDayEngine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */

@Module
public class DoomsDayModule {


    @Provides
    DoomsDayEngine provideDoomsDayEngine() {
        return new DoomsDayEngine();
    }

}
