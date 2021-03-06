package com.vehicles.factories.engines;

import com.vehicles.factories.interfaces.IEngines;

/**
 * Created by Mihai on 11/16/2014.
 * Class which characterizes the Diesel Engine type;
 */
public class Diesel implements IEngines {

    /**
     * The method which overwrites the general method with the same name from the IEngine
     * Interface; in this case, a Diesel Engine is installed;
     */
    @Override
    public void installEngine() {
        System.out.println("The following type of engine has been installed using the installEngine() method: Diesel");
    }
}
