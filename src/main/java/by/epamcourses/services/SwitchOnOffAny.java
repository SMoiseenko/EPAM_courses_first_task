package by.epamcourses.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchOnOffAny {

    public static void switchOnAny() {
	Scanner scanner = new Scanner(System.in);
	int choise = -1;

	while (choise != 0) {
	    System.out.println("\nYou can swich ON/OFF next appliances:");
	    CalculateUsingPower.calculateUsingPower();
	    for (int i = 0; i < DeepCollectionCopy.switchListCopy.size(); ++i) {
		if (DeepCollectionCopy.switchListCopy.get(i).getPowerStatus().equals("ON")) {
		    System.out.println((i + 1) + ". " + DeepCollectionCopy.switchListCopy.get(i).getName() + " "
			    + DeepCollectionCopy.switchListCopy.get(i).getModel() + " --- "
			    + DeepCollectionCopy.switchListCopy.get(i).getPowerStatus() + "   "
			    + DeepCollectionCopy.switchListCopy.get(i).getPowerСonsumption() + " W");
		} else {
		    System.out.println((i + 1) + ". " + DeepCollectionCopy.switchListCopy.get(i).getName() + " "
			    + DeepCollectionCopy.switchListCopy.get(i).getModel() + " --- "
			    + DeepCollectionCopy.switchListCopy.get(i).getPowerStatus());
		}
	    }

	    System.out.println("\n0. FINISH SWICH AND GO BACK");

	    try {
		choise = scanner.nextInt();
	    } catch (InputMismatchException e) {
		System.err.println("\nWrong choise, try again!\n");
		System.out.println(scanner.nextLine());
		choise = -1;
	    }

	    if (choise > 0 && choise <= DeepCollectionCopy.switchListCopy.size()) {
		if (DeepCollectionCopy.switchListCopy.get(choise - 1).getPowerStatus().equals("ON")) {
		    DeepCollectionCopy.switchListCopy.get(choise - 1).setPowerStatus(false);
		} else {
		    DeepCollectionCopy.switchListCopy.get(choise - 1).setPowerStatus(true);
		}
	    }
	    if (choise == 0) {
		System.out.println("GOING BACK\n");
	    }
	}
	// scanner.close();
    }

}
