package com.belov.artem.daggertest.models;

import com.belov.artem.daggertest.components.ApocalypseComponent;
import com.belov.artem.daggertest.components.DaggerApocalypseComponent;

import javax.inject.Inject;

/**
 * Created by artem on 11.05.17.
 */

public class Apocalypse {

    @Inject
    public DoomsDayMashine doomsDayMashine;
    @Inject
    public TheBeastFromSea theBeastFromSea;
    ApocalypseComponent apocalypseComponent;

    public Apocalypse(){
        apocalypseComponent = DaggerApocalypseComponent.builder().build();
        apocalypseComponent.inject(this);

    }

}
