package com.vehicles.factories.wheels;

import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 */
public class Racing implements ITires {

    @Override
    public void installTires() {
        System.out.println("The following type of tires have been installed using the installTires() method: Racing.");
    }
}
