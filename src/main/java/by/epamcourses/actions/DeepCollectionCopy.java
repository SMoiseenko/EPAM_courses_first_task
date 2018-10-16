package by.epamcourses.actions;

import java.util.ArrayList;
import java.util.Iterator;

import by.epamcourses.home_appliances.HomeAppliances;

public class DeepCollectionCopy {

    static ArrayList<HomeAppliances> switchListCopy = new ArrayList<HomeAppliances>(
	    Initializer.getHomeAppliancesList().size());
    static ArrayList<HomeAppliances> chooseListCopy = new ArrayList<HomeAppliances>(
	    Initializer.getHomeAppliancesList().size());

    public static void switchListCopy() {
	Iterator<HomeAppliances> itr = Initializer.getHomeAppliancesList().iterator();
	while (itr.hasNext()) {
	    switchListCopy.add(itr.next().clone());
	}
    }

    public static void chooseListCopy() {
	Iterator<HomeAppliances> itr = Initializer.getHomeAppliancesList().iterator();
	while (itr.hasNext()) {
	    chooseListCopy.add(itr.next().clone());
	}
    }
}