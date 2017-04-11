package com.mygdx.game.box2d;

import com.mygdx.game.enums.UserDataType;

/**
 * Created by Connie on 4/10/2017.
 */

public abstract class UserData {

    protected UserDataType userDataType;

    public UserData() {

    }

    public UserDataType getUserDataType() {
        return userDataType;
    }

}
