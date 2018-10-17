package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Collections;

import by.epamcourses.home_appliances.HomeAppliances;

public class SortedByPower {

    public static void sortedByPower() {

	ArrayList<HomeAppliances> sortedByPowerAppliances = new ArrayList<HomeAppliances>();

	sortedByPowerAppliances.addAll(0, Initializer.getHomeAppliancesList());
	Collections.sort(sortedByPowerAppliances);
	System.out.println("Sorted collection By power consumption:\n");
	for (int i = 0; i < sortedByPowerAppliances.size(); ++i) {
	    System.out.println((i + 1) + ". " + sortedByPowerAppliances.get(i).getName() + " "
		    + sortedByPowerAppliances.get(i).getModel() + " "
		    + sortedByPowerAppliances.get(i).getPowerСonsumption() + " W");
	}
	System.out.println("");
    }

}
