package by.epamcourses;

import org.testng.annotations.Test;

import by.epamcourses.big_appliances.Cooker;
import by.epamcourses.big_appliances.Fridge;
import by.epamcourses.big_appliances.RangeHood;
import by.epamcourses.big_appliances.WashingMachine;
import by.epamcourses.consumer_electronics.Laptop;
import by.epamcourses.consumer_electronics.Smartphone;
import by.epamcourses.consumer_electronics.SoundBar;
import by.epamcourses.consumer_electronics.Television;
import by.epamcourses.consumer_electronics.WiFiRouter;
import by.epamcourses.home_appliances.HomeAppliances;
import by.epamcourses.small_appliances.Kettle;
import by.epamcourses.small_appliances.Toaster;
import by.epamcourses.small_appliances.VacuumCleaner;
import by.epamcourses.small_appliances.Сhandelier;

public class SwicthOnTest {

    HomeAppliances[] testarray = new HomeAppliances[19];

    @Test
    public void totest() {
	testarray[0] = new Fridge("ATLANT", "ХМ 4307-000", 800);
	testarray[1] = new Fridge("LG", "GA-M429SARZ", 550);
	testarray[2] = new Cooker("GEFEST", "5140-02", 3500);
	testarray[3] = new Cooker("Hansa", "FCEB53000", 5300);
	testarray[4] = new WashingMachine("Indesit", "IWSB 50951 BY", 2400);
	testarray[5] = new WashingMachine("Bosch", "WLG20160OE", 2100);
	testarray[6] = new RangeHood("ZorG", "Technology Lana Black 60", 150);
	testarray[7] = new Сhandelier("Feron", "AL5000", 60);
	testarray[8] = new Kettle("Bosch", "TWK3A011", 2400);
	testarray[9] = new Toaster("DeLonghi", "CTOV 2103.BK", 900);
	testarray[10] = new VacuumCleaner("Karcher", "WD 3 P", 1000);
	testarray[11] = new Laptop("HP", "Pavilion DV6 3040er", 120);
	testarray[12] = new Smartphone("Iphone", "Xs", 18);
	testarray[13] = new Smartphone("Nokia", "3310", 3);
	testarray[14] = new SoundBar("JBL", "Bar Studio", 30);
	testarray[15] = new SoundBar("Sony", "HT-CT290", 300);
	testarray[16] = new Television("Samsung", "UE55NU8000U", 470);
	testarray[17] = new Television("LG", "OLED55B8PLA", 280);
	testarray[18] = new WiFiRouter("Xiaomi", "Mi Router 3G", 25);
	testarray[19] = new WiFiRouter("Zyxel", "Keenetic 4G III", 45);
    }

}
