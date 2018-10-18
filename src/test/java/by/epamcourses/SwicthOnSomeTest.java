package by.epamcourses;

import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;

import by.epamcourses.data.HomeAppliances;
import by.epamcourses.data.big_appliances.Cooker;
import by.epamcourses.data.consumer_electronics.Laptop;
import by.epamcourses.data.consumer_electronics.Smartphone;
import by.epamcourses.data.small_appliances.Сhandelier;

public class SwicthOnSomeTest {

    public ArrayList<HomeAppliances> testList = new ArrayList<>();
    public ArrayList<HomeAppliances> resultList = new ArrayList<>();
    int[] switchNext = { 7, 11, 30, 14, 2, 128, -500 };

    @BeforeMethod
    public void initTest() {
	resultList.add(new Сhandelier("Feron", "AL5000", 60));
	resultList.add(new Laptop("HP", "Pavilion DV6 3040er", 120));
	resultList.add(new Smartphone("Nokia", "3310", 3));
	resultList.add(new Cooker("GEFEST", "5140-02", 3500));
	for (HomeAppliances swOn : resultList) {
	    swOn.setPowerStatus(true);
	}

    }

    // @Test
    public void totest() {

    }

}
