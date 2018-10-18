package by.epamcourses;

import java.util.ArrayList;

import by.epamcourses.data.HomeAppliances;
import by.epamcourses.data.big_appliances.Cooker;
import by.epamcourses.data.big_appliances.Fridge;
import by.epamcourses.data.big_appliances.RangeHood;
import by.epamcourses.data.big_appliances.WashingMachine;
import by.epamcourses.data.consumer_electronics.Laptop;
import by.epamcourses.data.consumer_electronics.Smartphone;
import by.epamcourses.data.consumer_electronics.SoundBar;
import by.epamcourses.data.consumer_electronics.Television;
import by.epamcourses.data.consumer_electronics.WiFiRouter;
import by.epamcourses.data.small_appliances.Kettle;
import by.epamcourses.data.small_appliances.Toaster;
import by.epamcourses.data.small_appliances.VacuumCleaner;
import by.epamcourses.data.small_appliances.Сhandelier;

public class InitForTest {
    public static ArrayList<HomeAppliances> initArrayList() {
	ArrayList<HomeAppliances> allInFlat = new ArrayList<>();
	allInFlat.add(new Fridge("ATLANT", "ХМ 4307-000", 800));
	allInFlat.add(new Fridge("LG", "GA-M429SARZ", 550));
	allInFlat.add(new Cooker("GEFEST", "5140-02", 3500));
	allInFlat.add(new Cooker("Hansa", "FCEB53000", 5300));
	allInFlat.add(new WashingMachine("Indesit", "IWSB 50951 BY", 2400));
	allInFlat.add(new WashingMachine("Bosch", "WLG20160OE", 2100));
	allInFlat.add(new RangeHood("ZorG", "Technology Lana Black 60", 150));
	allInFlat.add(new Сhandelier("Feron", "AL5000", 60));
	allInFlat.add(new Kettle("Bosch", "TWK3A011", 2400));
	allInFlat.add(new Toaster("DeLonghi", "CTOV 2103.BK", 900));
	allInFlat.add(new VacuumCleaner("Karcher", "WD 3 P", 1000));
	allInFlat.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	allInFlat.add(new Smartphone("Iphone", "Xs", 18));
	allInFlat.add(new Smartphone("Nokia", "3310", 3));
	allInFlat.add(new SoundBar("JBL", "Bar Studio", 30));
	allInFlat.add(new SoundBar("Sony", "HT-CT290", 300));
	allInFlat.add(new Television("Samsung", "UE55NU8000U", 470));
	allInFlat.add(new Television("LG", "OLED55B8PLA", 280));
	allInFlat.add(new WiFiRouter("Xiaomi", "Mi Router 3G", 25));
	allInFlat.add(new WiFiRouter("Zyxel", "Keenetic 4G III", 45));
	return allInFlat;
    }

}
