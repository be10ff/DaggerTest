package com.belov.artem.daggertest.components;

import com.belov.artem.daggertest.models.Apocalypse;
import com.belov.artem.daggertest.modules.ApocalypseModule;
import com.belov.artem.daggertest.modules.DoomsDayModule;

import dagger.Component;

/**
 * Created by artem on 11.05.17.
 */

@Component(modules = {ApocalypseModule.class, DoomsDayModule.class})
public interface ApocalypseComponent {
    void inject(Apocalypse apocalypse);

//    DoomsDayMashine provideDoomsDayMashine();

}
