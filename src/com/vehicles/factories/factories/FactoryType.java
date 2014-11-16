package com.vehicles.factories.factories;

/**
 * Created by Mihai on 11/16/2014.
 */
public class FactoryType {

    public static AbstractFactory getFactory(String type)
    {
        if(type.equalsIgnoreCase("ENGINE"))
            return new EngineFactory();
        else if(type.equalsIgnoreCase("TIRES"))
            return new TiresFactory();

        return null;

    }
}
