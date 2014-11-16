package com.vehicles.factories.wheels;

import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 */
public class Casual implements ITires {

    @Override
    public void installTires() {

        System.out.println("The following type of wheels have been installed using the installTires() method: Casual.");
    }
}
