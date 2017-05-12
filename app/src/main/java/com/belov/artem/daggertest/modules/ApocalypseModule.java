package com.belov.artem.daggertest.modules;

import com.belov.artem.daggertest.models.DoomsDayEngine;
import com.belov.artem.daggertest.models.DoomsDayMashine;
import com.belov.artem.daggertest.models.TheBeastFromSea;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */

@Module
public class ApocalypseModule {

    @Provides
    DoomsDayMashine providesDoomsDayMashine(DoomsDayEngine engine) {
        return new DoomsDayMashine(engine);
    }


    @Provides
    TheBeastFromSea providesTheBeastFromSea() {
        return new TheBeastFromSea();
    }
}
