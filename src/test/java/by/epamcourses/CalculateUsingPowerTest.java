package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.epamcourses.entity.HomeAppliances;
import by.epamcourses.services.CalculateUsingPower;

public class CalculateUsingPowerTest {

    public ArrayList<HomeAppliances> initList = new ArrayList<>();
    public int expectedResult;

    @BeforeMethod
    public void beforeMethod() {
	expectedResult = 2100 + 150 + 60 + 2400 + 900 + 1000 + 120 + 18 + 3 + 30;

	InitForTest newInit = new InitForTest();
	initList = newInit.getAvailableAppliances();
	for (int i = 5; i < initList.size() - 5; ++i) {
	    initList.get(i).setPowerStatus(true);
	}
    }

    @Test
    public void calculateUsingPowerTest() {
	// GIVEN
	CalculateUsingPower testedMethod = new CalculateUsingPower();
	// WHEN
	int result = testedMethod.calculateUsingPower(initList);
	// THEN
	Assert.assertEquals(expectedResult, result);
    }
}
