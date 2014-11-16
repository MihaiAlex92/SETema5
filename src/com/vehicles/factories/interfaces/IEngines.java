package com.vehicles.factories.interfaces;

/**
 * Created by Mihai on 11/16/2014.
 * This is the interface for Engine components. An IEngines object can only be initialized with a type of Engine
 * implemented in the "engines" packet;
 */
public interface IEngines {

    /**
     * The general method which implements the instalation procedure of an engine
     */
    void installEngine();
}
