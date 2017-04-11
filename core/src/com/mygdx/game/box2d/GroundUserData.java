package com.mygdx.game.box2d;

import com.mygdx.game.enums.UserDataType;

/**
 * Created by Connie on 4/10/2017.
 */

public class GroundUserData extends UserData{
    public GroundUserData() {
        super();
        userDataType = UserDataType.GROUND;
    }
}
