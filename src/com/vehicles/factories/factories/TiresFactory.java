package com.vehicles.factories.factories;

import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;
import com.vehicles.factories.wheels.Casual;
import com.vehicles.factories.wheels.Racing;
import com.vehicles.factories.wheels.Winter;

/**
 * Created by Mihai on 11/16/2014.
 * Class which overrides the <code>AbstractFactory</code> method <code>getTires(String engine)</code>
 * This is the Tires Factory
 */
public class TiresFactory extends AbstractFactory {

    @Override
    public ITires getTires(String tires) {
        if (tires == null)
            return null;
        if (tires.equalsIgnoreCase("WINTER"))
            return new Winter();
        else if (tires.equalsIgnoreCase("RACING"))
            return new Racing();
        else if (tires.equalsIgnoreCase("CASUAL"))
            return new Casual();

        return null;
    }

    /*
     * This method is never used from this class; It is only used from the <code>EngineFactory</code> Class;
     */
    @Override
    public IEngines getEngine(String engine) {
        return null;
    }
}
