package org.testing;

import org.junit.Test;
import org.openqa.selenium.support.FindBy;

public class BuyBillets extends SourcePage {

    @Test
    public void findBillets() {
        String dayTo = "10.06.2025";
        String dayOut = "17.06.2025";
        String whereCity = "Саратов";
        String whereOutCity = "Москва";
        ElementMethodsPage elementMethodsPage = new ElementMethodsPage(driver);
        elementMethodsPage.findBilets(dayTo,
                                            dayOut,
                                            whereCity,
                                            whereOutCity);



    }
}
