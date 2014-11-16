package com.vehicles.factories.factories;

import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;
import com.vehicles.factories.wheels.Casual;
import com.vehicles.factories.wheels.Racing;
import com.vehicles.factories.wheels.Winter;

/**
 * Created by Mihai on 11/16/2014.
 */
public class TiresFactory extends AbstractFactory {

    @Override
    public ITires getTires(String tires) {
        if(tires == null)
            return null;
        if(tires.equalsIgnoreCase("WINTER"))
            return new Winter();
        else if(tires.equalsIgnoreCase("RACING"))
            return new Racing();
        else if(tires.equalsIgnoreCase("CASUAL"))
            return new Casual();

        return null;
    }

    @Override
   public IEngines getEngine(String engine) {
        return null;
    }
}
