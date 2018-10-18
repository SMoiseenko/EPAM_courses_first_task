package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Collections;

import by.epamcourses.data.HomeAppliances;

public class SortedByPower {

    public static ArrayList<HomeAppliances> sortedByPower(ArrayList<HomeAppliances> sortMe) {

	Collections.sort(sortMe);

	return sortMe;
    }

}
