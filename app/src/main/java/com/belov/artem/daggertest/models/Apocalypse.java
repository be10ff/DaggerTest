package com.belov.artem.daggertest.models;

;
import com.belov.artem.daggertest.components.DaggerDoomsDayComponent;
import com.belov.artem.daggertest.components.DoomsDayComponent;

import javax.inject.Inject;

/**
 * Created by artem on 11.05.17.
 */

public class Apocalypse {
    private DoomsDayComponent doomsDayComponent;

    @Inject
    public DoomsDayMashine doomsDayMashine;

    public Apocalypse(){
//        this.doomsDayComponent.inject(this);
        doomsDayComponent = DaggerDoomsDayComponent.builder().build();
        this.doomsDayComponent.inject(this);

    }

}
