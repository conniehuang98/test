package com.mygdx.game.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.box2d.GroundUserData;

/**
 * Created by Connie on 4/9/2017.
 */

public class Ground extends GameActor {

    public Ground(Body body) {
        super(body);
    }
    @Override
    public GroundUserData getUserData() {
        return (GroundUserData) userData;
    }


}
