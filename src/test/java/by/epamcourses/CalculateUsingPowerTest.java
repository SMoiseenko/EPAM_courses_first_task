package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.epamcourses.data.HomeAppliances;
import by.epamcourses.data.big_appliances.Cooker;
import by.epamcourses.data.big_appliances.Fridge;
import by.epamcourses.data.big_appliances.RangeHood;
import by.epamcourses.data.big_appliances.WashingMachine;
import by.epamcourses.services.CalculateUsingPower;

public class CalculateUsingPowerTest {

    public ArrayList<HomeAppliances> testList = new ArrayList<>();
    public int rightResult;

    @BeforeTest
    public void initTest() {
	rightResult = 800 + 550 + 3500 + 5300 + 2400 + 2100 + 150;

	testList.add(new Fridge("ATLANT", "ХМ 4307-000", 800));
	testList.add(new Fridge("LG", "GA-M429SARZ", 550));
	testList.add(new Cooker("GEFEST", "5140-02", 3500));
	testList.add(new Cooker("Hansa", "FCEB53000", 5300));
	testList.add(new WashingMachine("Indesit", "IWSB 50951 BY", 2400));
	testList.add(new WashingMachine("Bosch", "WLG20160OE", 2100));
	testList.add(new RangeHood("ZorG", "Technology Lana Black 60", 150));
	for (int i = 0; i < testList.size(); ++i) {
	    testList.get(i).setPowerStatus(true);
	}
    }

    @Test
    public void calculateUsingPowerTest() {

	int result = CalculateUsingPower.calculateUsingPower(testList);

	Assert.assertEquals(rightResult, result);
    }
}
