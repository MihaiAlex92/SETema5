package com.vehicles.factories.factories;

/**
 * Created by Mihai on 11/16/2014.
 * Class which is used to identify the type of factory needed for the installation process of a
 * specified component
 */
public class FactoryType {

    /**
     * Method which identifies the type of factory needed for the installation process of a component;
     *
     * @param type specifies if an Engine or a set of Tires needs to be installed;
     * @return <code>EngineFactory</code> object if <code>type</code> = "ENGINE",
     * <code>TiresFactory</code> object if <code>type</code> = "TIRES"
     */
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("ENGINE"))
            return new EngineFactory();
        else if (type.equalsIgnoreCase("TIRES"))
            return new TiresFactory();

        return null;

    }
}
