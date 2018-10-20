package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epamcourses.entity.HomeAppliances;
import by.epamcourses.entity.big_appliances.Fridge;
import by.epamcourses.entity.big_appliances.RangeHood;
import by.epamcourses.entity.consumer_electronics.Laptop;
import by.epamcourses.entity.consumer_electronics.SoundBar;
import by.epamcourses.entity.consumer_electronics.Television;
import by.epamcourses.entity.small_appliances.Toaster;
import by.epamcourses.entity.small_appliances.VacuumCleaner;
import by.epamcourses.services.FindByCriteria;

public class FindByCriteriaTest {

    public ArrayList<HomeAppliances> initList = new InitForTest().getAvailableAppliances();
    public ArrayList<HomeAppliances> expectedPowList = new ArrayList<>();
    public ArrayList<HomeAppliances> expectedNameList = new ArrayList<>();
    public String name;
    int from, till;

    @BeforeClass
    public void beforeMethod() {
	name = "TELEVISION";
	from = 100;
	till = 1000;

	expectedPowList.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	expectedPowList.add(new RangeHood("ZorG", "Technology Lana Black 60", 150));
	expectedPowList.add(new Television("LG", "OLED55B8PLA", 280));
	expectedPowList.add(new SoundBar("Sony", "HT-CT290", 300));
	expectedPowList.add(new Television("Samsung", "UE55NU8000U", 470));
	expectedPowList.add(new Fridge("LG", "GA-M429SARZ", 550));
	expectedPowList.add(new Fridge("ATLANT", "ХМ 4307-000", 800));
	expectedPowList.add(new Toaster("DeLonghi", "CTOV 2103.BK", 900));
	expectedPowList.add(new VacuumCleaner("Karcher", "WD 3 P", 1000));

	expectedNameList.add(new Television("Samsung", "UE55NU8000U", 470));
	expectedNameList.add(new Television("LG", "OLED55B8PLA", 280));
    }

    @Test
    public void testFindByPower() {
	// GIVEN
	FindByCriteria newFinder = new FindByCriteria();
	// WHEN
	ArrayList<HomeAppliances> actualList = newFinder.findByPower(initList, from, till);
	// THEN
	Assert.assertEquals(actualList, expectedPowList);
    }

    @Test
    public void testFindByName() {
	// GIVEN
	FindByCriteria newFinder = new FindByCriteria();
	// WHEN
	ArrayList<HomeAppliances> actualList = newFinder.findByName(initList, name);
	// THEN
	Assert.assertEquals(expectedNameList, actualList);
    }
}
