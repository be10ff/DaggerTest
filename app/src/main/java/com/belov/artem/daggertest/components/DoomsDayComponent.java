package com.belov.artem.daggertest.components;

import com.belov.artem.daggertest.models.Apocalypse;
import com.belov.artem.daggertest.models.DoomsDayMashine;
import com.belov.artem.daggertest.modules.DoomsDayModule;

import dagger.Component;
import dagger.Provides;

/**
 * Created by artem on 11.05.17.
 */

@Component(modules = DoomsDayModule.class)
public interface DoomsDayComponent {
    void inject(Apocalypse apocalypse);

    DoomsDayMashine getDoomsDayMashine();

}
