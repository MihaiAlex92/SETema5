package com.vehicles.factories;

import com.vehicles.factories.factories.AbstractFactory;
import com.vehicles.factories.interfaces.IEngines;
import com.vehicles.factories.interfaces.ITires;

import static com.vehicles.factories.factories.FactoryType.getFactory;

/**
 * Created by Mihai on 11/16/2014.
 * This is the Main class of the program in which all the magic happens!!!
 * It represents the starting point for running the program.
 */
public class Main {


    public static void main(String[] args) {

        /* This part of the code checks the installation procedure of all types of engines which have been implemented;
        Several variables are being declared and initialized;
         */
        AbstractFactory engineFactory = getFactory("ENGINE");
        IEngines engine1 = engineFactory.getEngine("DIESEL");
        engine1.installEngine();
        IEngines engine2 = engineFactory.getEngine("OTTO");
        engine2.installEngine();
        IEngines engine3 = engineFactory.getEngine("ELECTRIC");
        engine3.installEngine();
        IEngines engine4 = engineFactory.getEngine("TURBO");
        engine4.installEngine();

        // This part of code checks the installation procedure of all types of tires which have been implemented;
        //  Several variables are being declared and initialized;
        AbstractFactory tireFactory = getFactory("TIRES");
        ITires tire1 = tireFactory.getTires("WINTER");
        tire1.installTires();
        ITires tire2 = tireFactory.getTires("CASUAL");
        tire2.installTires();
        ITires tire3 = tireFactory.getTires("RACING");
        tire3.installTires();


    }

}
