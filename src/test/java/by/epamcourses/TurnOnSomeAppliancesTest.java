package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.epamcourses.entity.HomeAppliances;
import by.epamcourses.entity.big_appliances.Cooker;
import by.epamcourses.entity.consumer_electronics.Laptop;
import by.epamcourses.entity.consumer_electronics.Smartphone;
import by.epamcourses.entity.small_appliances.Сhandelier;
import by.epamcourses.services.TurnOnSomeAppliances;

/**
 * Unit test for {@link TurnOnSomeAppliances.swichedOn} method.
 */
public class TurnOnSomeAppliancesTest {

    public ArrayList<HomeAppliances> initList = new ArrayList<>();
    public ArrayList<HomeAppliances> expectedList = new ArrayList<>();
    int[] switchOnThese = { 7, 11, 30, 13, 2, 128, -500 };

    @BeforeMethod
    public void beforeMethod() {
	initList = new InitForTest().getAvailableAppliances();
	expectedList.add(new Сhandelier("Feron", "AL5000", 60));
	expectedList.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	expectedList.add(new Smartphone("Nokia", "3310", 3));
	expectedList.add(new Cooker("GEFEST", "5140-02", 3500));
	for (HomeAppliances swOn : expectedList) {
	    swOn.setPowerStatus(true);
	}
    }

    @Test
    public void testSwichedOn() {
	// GIVEN
	TurnOnSomeAppliances testedMethod = new TurnOnSomeAppliances();
	// WHEN
	ArrayList<HomeAppliances> resultList = testedMethod.turnOn(initList, switchOnThese);
	// THEN
	Assert.assertEquals(resultList, expectedList);
    }
}
