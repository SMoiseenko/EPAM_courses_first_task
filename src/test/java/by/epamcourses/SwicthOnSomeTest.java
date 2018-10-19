package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.epamcourses.data.HomeAppliances;
import by.epamcourses.data.big_appliances.Cooker;
import by.epamcourses.data.consumer_electronics.Laptop;
import by.epamcourses.data.consumer_electronics.Smartphone;
import by.epamcourses.data.small_appliances.Сhandelier;
import by.epamcourses.services.SwitchOnSomeAppliances;

public class SwicthOnSomeTest {

    public ArrayList<HomeAppliances> testList = new ArrayList<>();
    public ArrayList<HomeAppliances> resultList = new ArrayList<>();
    int[] switchNext = { 7, 11, 30, 13, 2, 128, -500 };

    @BeforeMethod
    public void initTest() {
	testList.add(new Сhandelier("Feron", "AL5000", 60));
	testList.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	testList.add(new Smartphone("Nokia", "3310", 3));
	testList.add(new Cooker("GEFEST", "5140-02", 3500));
	for (HomeAppliances swOn : testList) {
	    swOn.setPowerStatus(true);
	}

    }

    @Test
    public void swichedOn() {

	resultList = SwitchOnSomeAppliances.swichedOn(InitForTest.initArrayList(), switchNext);
	Assert.assertEquals(testList, resultList);

    }

}
