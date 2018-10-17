package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.home_appliances.HomeAppliances;

public class switchOnAppliances {

    public ArrayList<HomeAppliances> swichedOn(HomeAppliances[] appl) {
	ArrayList<HomeAppliances> swichedOnList = new ArrayList<>();
	for (HomeAppliances device : appl) {
	    swichedOnList.add(device);
	}

	return swichedOnList;
    }

    public static void makeInitialization() {

    }

}
