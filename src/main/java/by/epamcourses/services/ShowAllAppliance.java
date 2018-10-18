package by.epamcourses.services;

import by.epamcourses.data.HomeAppliances;

public class ShowAllAppliance {

    public static void showAllAppliance() {
	System.out.println("\nList of all home appliens:\n");

	for (HomeAppliances i : Initializer.getHomeAppliancesList()) {
	    System.out.println(i.getType() + " --- " + i.getName() + " \"" + i.getModel() + "\" --- "
		    + i.getPowerСonsumption() + " W. ");
	}
	System.out.println("");
    }
}