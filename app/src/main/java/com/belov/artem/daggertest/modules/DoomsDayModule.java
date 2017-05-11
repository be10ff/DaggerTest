package com.belov.artem.daggertest.modules;

import com.belov.artem.daggertest.models.Apocalypse;
import com.belov.artem.daggertest.models.DoomsDayMashine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */

@Module
public class DoomsDayModule {
    private Apocalypse apocalypse;

    public DoomsDayModule(Apocalypse apocalypse){
        this.apocalypse = apocalypse;
    }

    @Provides
    DoomsDayMashine provideDoomsDayMashine(){
        return  new DoomsDayMashine();
    }

}
