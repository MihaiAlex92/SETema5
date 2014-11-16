package com.vehicles.factories.wheels;

import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 *  This class describes the Racing type of Tires.
 */
public class Racing implements ITires {

    /**
     * The method which overwrites the general method with the same name from the ITires
     * Interface; in this case, a set of Racing Tires is installed;
     */
    @Override
    public void installTires() {
        System.out.println("The following type of tires have been installed using the installTires() method: Racing.");
    }
}
