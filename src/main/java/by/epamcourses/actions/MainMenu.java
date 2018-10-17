package by.epamcourses.actions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    public static void showMenu() {
	Scanner scanner = new Scanner(System.in);
	int choice = -1;
	System.out.println("Hello!!! I am the Flat with a lot of home appliances.");

	while (choice != 0) {

	    System.out.println("Please, choose what you want to do:\n");
	    System.out.println("1. Show all appliances.");
	    System.out.println("2. Switch ON/OFF anyone appliance.");
	    System.out.println("3. Switch on all appliances.");
	    System.out.println("4. Switch off all appliances.");
	    System.out.println("5 Calculate power consumption of switched on appliances.");
	    System.out.println("6. Sort all appliances by power consumption.");
	    System.out.println("7. Find appliance(s) by some criteria.");
	    System.out.println("0. EXIT PROGRAMM");

	    try {
		choice = scanner.nextInt();

	    } catch (InputMismatchException e) {
		System.err.println("\nWrong data! Make right choice.\n");
		System.out.println(scanner.nextLine()); // put in log
		// scanner.nextLine();
		choice = -1;
	    }

	    switch (choice) {
	    /*
	     * case -1: break; //why i wrote it???
	     */
	    case 1:
		ShowAllAppliance.showAllAppliance();

		break;
	    case 2:
		SwitchOnOffAny.switchOnAny();
		break;

	    case 3:
		SwitchOnOffAll.swithedOnAll();
		break;

	    case 4:
		SwitchOnOffAll.swithedOffAll();
		break;

	    case 5:
		CalculateUsingPower.calculateUsingPower();
		break;

	    case 6:
		SortedByPower.sortedByPower();
		break;
	    case 0:
		System.out.println("\nGOODBYE\n");
		break;
	    default:
		System.out.println("\nMake right choice.\n");
	    }

	}
	scanner.close();
    }

}
