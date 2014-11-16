package com.vehicles.factories.factories;

import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 */
public abstract class AbstractFactory {

public abstract ITires getTires(String tires);
 public abstract IEngines getEngine(String engine);
}
