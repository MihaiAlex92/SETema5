package com.vehicles.factories.engines;

import com.vehicles.factories.interfaces.IEngines;

/**
 * Created by Mihai on 11/16/2014.
 */
public class Diesel implements IEngines {

    @Override
    public void installEngine()
    {
        System.out.println("The following type of engine has been installed using the installEngine() method: Diesel");
    }
}
