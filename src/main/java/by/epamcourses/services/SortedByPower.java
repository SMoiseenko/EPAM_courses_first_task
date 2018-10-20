package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Collections;

import by.epamcourses.entity.HomeAppliances;

public class SortedByPower {

    public ArrayList<HomeAppliances> sortedByPower(ArrayList<HomeAppliances> sortMe) {
	// need make deep copy, then sort deep copy, then return deepcopy
	// or we do not need return list. we take list, then sort list, and then
	// continue to work with this sorted instance of list

	Collections.sort(sortMe);

	return sortMe;
    }

}
