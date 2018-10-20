package by.epamcourses;

import java.util.ArrayList;

import by.epamcourses.entity.HomeAppliances;
import by.epamcourses.entity.big_appliances.Cooker;
import by.epamcourses.entity.big_appliances.Fridge;
import by.epamcourses.entity.big_appliances.RangeHood;
import by.epamcourses.entity.big_appliances.WashingMachine;
import by.epamcourses.entity.consumer_electronics.Laptop;
import by.epamcourses.entity.consumer_electronics.Smartphone;
import by.epamcourses.entity.consumer_electronics.SoundBar;
import by.epamcourses.entity.consumer_electronics.Television;
import by.epamcourses.entity.consumer_electronics.WiFiRouter;
import by.epamcourses.entity.small_appliances.Kettle;
import by.epamcourses.entity.small_appliances.Toaster;
import by.epamcourses.entity.small_appliances.VacuumCleaner;
import by.epamcourses.entity.small_appliances.Сhandelier;

public class InitForTest {

    private ArrayList<HomeAppliances> availableAppliances = new ArrayList<>();

    public InitForTest() {
	availableAppliances.add(new Fridge("ATLANT", "ХМ 4307-000", 800));
	availableAppliances.add(new Fridge("LG", "GA-M429SARZ", 550));
	availableAppliances.add(new Cooker("GEFEST", "5140-02", 3500));
	availableAppliances.add(new Cooker("Hansa", "FCEB53000", 5300));
	availableAppliances.add(new WashingMachine("Indesit", "IWSB 50951 BY", 2400));
	availableAppliances.add(new WashingMachine("Bosch", "WLG20160OE", 2100));
	availableAppliances.add(new RangeHood("ZorG", "Technology Lana Black 60", 150));
	availableAppliances.add(new Сhandelier("Feron", "AL5000", 60));
	availableAppliances.add(new Kettle("Bosch", "TWK3A011", 2400));
	availableAppliances.add(new Toaster("DeLonghi", "CTOV 2103.BK", 900));
	availableAppliances.add(new VacuumCleaner("Karcher", "WD 3 P", 1000));
	availableAppliances.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	availableAppliances.add(new Smartphone("Iphone", "Xs", 18));
	availableAppliances.add(new Smartphone("Nokia", "3310", 3));
	availableAppliances.add(new SoundBar("JBL", "Bar Studio", 30));
	availableAppliances.add(new SoundBar("Sony", "HT-CT290", 300));
	availableAppliances.add(new Television("Samsung", "UE55NU8000U", 470));
	availableAppliances.add(new Television("LG", "OLED55B8PLA", 280));
	availableAppliances.add(new WiFiRouter("Xiaomi", "Mi Router 3G", 25));
	availableAppliances.add(new WiFiRouter("Zyxel", "Keenetic 4G III", 45));
    }

    public ArrayList<HomeAppliances> getAvailableAppliances() {
	return availableAppliances;
    }
}
