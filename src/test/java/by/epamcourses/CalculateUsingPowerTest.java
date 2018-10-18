package by.epamcourses;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.epamcourses.data.HomeAppliances;
import by.epamcourses.services.CalculateUsingPower;

public class CalculateUsingPowerTest {

    public ArrayList<HomeAppliances> testList = new ArrayList<>();
    public int rightResult;

    @BeforeMethod
    public void initTest() {
	rightResult = 2100 + 150 + 60 + 2400 + 900 + 1000 + 120 + 18 + 3 + 30;

	testList = InitForTest.initArrayList();

	for (int i = 5; i < testList.size() - 5; ++i) {
	    testList.get(i).setPowerStatus(true);
	}
    }

    @Test
    public void calculateUsingPowerTest() {

	int result = CalculateUsingPower.calculateUsingPower(testList);

	Assert.assertEquals(rightResult, result);
    }
}
