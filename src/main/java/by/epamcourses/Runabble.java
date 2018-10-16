package by.epamcourses;

import by.epamcourses.actions.DeepCollectionCopy;
import by.epamcourses.actions.Initializer;
import by.epamcourses.actions.MainMenu;

public class Runabble {

    public static void main(String[] args) {

	Initializer.makeInitialization();
	DeepCollectionCopy.switchListCopy();
	DeepCollectionCopy.chooseListCopy();
	MainMenu.showMenu();
    }

}
