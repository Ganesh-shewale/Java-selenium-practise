package testRunner;

import base.BaseClass;
import tests.MahasscboardTest;

public class MainRunner {
	public static void main(String[] args) {
		BaseClass.initializeDriver();
		
		MahasscboardTest test = new MahasscboardTest();
        test.runTest();

        BaseClass.tearDown();
	}

}
