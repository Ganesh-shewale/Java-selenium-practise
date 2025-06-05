package tests;

import base.BaseClass;
import pages.Mahasscboard;

public class MahasscboardTest {
	
	public void runTest() {
		Mahasscboard page = new Mahasscboard(BaseClass.driver);

        page.highlightBoardText();
        page.highlightHomeRibbon();
    }

}
