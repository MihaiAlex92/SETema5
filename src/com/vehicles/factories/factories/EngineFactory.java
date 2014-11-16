package com.vehicles.factories.factories;

import com.vehicles.factories.engines.Diesel;
import com.vehicles.factories.engines.Electric;
import com.vehicles.factories.engines.Otto;
import com.vehicles.factories.engines.Turbo;
import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;

/**
 * Created by Mihai on 11/16/2014.
 * Class which overrides the <code>AbstractFactory</code> method <code>getEngine(String engine)</code>
 * This is the Engine Factory
 */
public class EngineFactory extends AbstractFactory {


    @Override
    public IEngines getEngine(String engine) {

        if (engine == null)
            return null;
        if (engine.equalsIgnoreCase("OTTO"))
            return new Otto();
        else if (engine.equalsIgnoreCase("ELECTRIC"))
            return new Electric();
        else if (engine.equalsIgnoreCase("DIESEL"))
            return new Diesel();
        else if (engine.equalsIgnoreCase("TURBO"))
            return new Turbo();

        return null;
    }


    /*
     * This method is never used from this class; It is only used from the <code>TiresFactory</code> Class;
     */
    @Override
    public ITires getTires(String tires) {
        return null;
    }
}
