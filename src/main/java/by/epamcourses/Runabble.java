package by.epamcourses;

import by.epamcourses.services.DeepCollectionCopy;
import by.epamcourses.services.Initializer;
import by.epamcourses.services.MainMenu;

public class Runabble {

    public static void main(String[] args) {

	Initializer.makeInitialization();
	DeepCollectionCopy.switchListCopy();
	DeepCollectionCopy.chooseListCopy();
	MainMenu.showMenu();
    }

}
