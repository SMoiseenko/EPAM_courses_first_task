package by.epamcourses.actions;

import java.util.ArrayList;

import by.epamcourses.big_appliances.Cooker;
import by.epamcourses.big_appliances.Fridge;
import by.epamcourses.big_appliances.RangeHood;
import by.epamcourses.big_appliances.WashingMachine;
import by.epamcourses.home_appliances.HomeAppliances;
import by.epamcourses.small_appliances.Kettle;
import by.epamcourses.small_appliances.Toaster;
import by.epamcourses.small_appliances.VacuumCleaner;
import by.epamcourses.small_appliances.Сhandelier;

public class Initializer {

    private static ArrayList<HomeAppliances> homeAppliancesList = new ArrayList<HomeAppliances>();

    public static ArrayList<HomeAppliances> getHomeAppliancesList() {
	return homeAppliancesList;
    }

    public static void makeInitialization() {
	homeAppliancesList.add(new Fridge("ATLANT ХМ 4307-000", 800));
	homeAppliancesList.add(new Cooker("GEFEST 5140-02", 3500));
	homeAppliancesList.add(new WashingMachine("Indesit IWSB 50951 BY", 2400));
	homeAppliancesList.add(new RangeHood("ZorG Technology Lana Black 60", +150));
	homeAppliancesList.add(new Сhandelier("Feron AL5000", +60));
	homeAppliancesList.add(new Kettle("Bosch TWK3A011", +2400));
	homeAppliancesList.add(new Toaster("DeLonghi CTOV 2103.BK", +900));
	homeAppliancesList.add(new VacuumCleaner("Karcher WD 3 P", +1000));

    }

}
