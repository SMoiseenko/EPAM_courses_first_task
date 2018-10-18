package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.data.HomeAppliances;

public class CalculateUsingPower {

    public static int calculateUsingPower(ArrayList<HomeAppliances> homeAppliances) {
	int powCons = 0;
	for (HomeAppliances aList : homeAppliances) {
	    if (aList.isPowerStatus() == true) {
		powCons += aList.getPowerСonsumption();
	    }
	}
	return powCons;
    }
}
