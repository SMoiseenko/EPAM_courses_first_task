package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
import by.epamcourses.services.SortedByPower;

public class SortedByPowerTest {

    public ArrayList<HomeAppliances> initList = new ArrayList<>();
    public ArrayList<HomeAppliances> expectedList = new ArrayList<>();

    @BeforeMethod
    public void beforeMethod() {
	initList = new InitForTest().getAvailableAppliances();
	expectedList.add(new Smartphone("Nokia", "3310", 3));
	expectedList.add(new Smartphone("Iphone", "Xs", 18));
	expectedList.add(new WiFiRouter("Xiaomi", "Mi Router 3G", 25));
	expectedList.add(new SoundBar("JBL", "Bar Studio", 30));
	expectedList.add(new WiFiRouter("Zyxel", "Keenetic 4G III", 45));
	expectedList.add(new Сhandelier("Feron", "AL5000", 60));
	expectedList.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	expectedList.add(new RangeHood("ZorG", "Technology Lana Black 60", 150));
	expectedList.add(new Television("LG", "OLED55B8PLA", 280));
	expectedList.add(new SoundBar("Sony", "HT-CT290", 300));
	expectedList.add(new Television("Samsung", "UE55NU8000U", 470));
	expectedList.add(new Fridge("LG", "GA-M429SARZ", 550));
	expectedList.add(new Fridge("ATLANT", "ХМ 4307-000", 800));
	expectedList.add(new Toaster("DeLonghi", "CTOV 2103.BK", 900));
	expectedList.add(new VacuumCleaner("Karcher", "WD 3 P", 1000));
	expectedList.add(new WashingMachine("Bosch", "WLG20160OE", 2100));
	expectedList.add(new WashingMachine("Indesit", "IWSB 50951 BY", 2400));
	expectedList.add(new Kettle("Bosch", "TWK3A011", 2400));
	expectedList.add(new Cooker("GEFEST", "5140-02", 3500));
	expectedList.add(new Cooker("Hansa", "FCEB53000", 5300));
    }

    @Test
    public void testSortedByPower() {
	// GIVEN
	SortedByPower testedMethod = new SortedByPower();
	// WHEN
	ArrayList<HomeAppliances> resultList = testedMethod.sortedByPower(initList);
	// THEN
	Assert.assertEquals(resultList, expectedList);
    }
}
