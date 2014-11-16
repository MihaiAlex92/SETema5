package com.vehicles.factories.interfaces;

/**
 * Created by Mihai on 11/16/2014.
 * This is the interface for Tires components. An ITires object can only be initialized with a type of Tires
 * implemented in the "wheels" packet;
 */
public interface ITires {


    /**
     * The general method which implements the instalation procedure of a set of tires
     */
    void installTires();
}
