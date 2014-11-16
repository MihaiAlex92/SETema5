package com.vehicles.factories.factories;

import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 * Abstract class which implements the general methods for specifying the type of tires or engine
 * which needs to be installed; The method for Engines will be overriden in the EngineFactory class,
 * the method for Tires will be overridden in the TiresFactory class.
 */
public abstract class AbstractFactory {


    /**
     * Method which gets the type of tires that has been scheduled to be installed.
     *
     * @param tires specifies the desired type of tires;
     * @return <code>ITires</code> object type if <code>tires</code> represents an existing type of tires
     * specified for this Interface type
     * or <code>null</code> otherwise;
     */
    public abstract ITires getTires(String tires);

    /**
     * Method which gets the type of engine that has been scheduled to be installed.
     *
     * @param engine specifies the desired type of engine;
     * @return <code>IEngines</code> object type if <code>engine</code> represents an existing type of engines
     * specified for this Interface type
     * or <code>null</code> otherwise;
     */
    public abstract IEngines getEngine(String engine);
}
