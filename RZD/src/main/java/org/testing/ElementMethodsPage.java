package org.testing;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.SelenideElementDescriber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ElementMethodsPage extends SourcePage {

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[3]/div[1]/input")
    private WebElement btnCalendarTo;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[6]/div[2]/table/tbody/tr[4]/td[2]/a")
    private WebElement neededDayTo;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[4]/div[1]/input")
    private WebElement btnCalendarOut;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[6]/div[2]/table/tbody/tr[5]/td[1]/a")
    private WebElement neededDayOut;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[1]/ul/li[2]")
    public WebElement chooseWhereCity;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]")
    public WebElement chooseWhereOutCity;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[1]/div[1]/input")
    public WebElement findWhere;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[2]/div[1]/input")
    public WebElement findWhereOut;
    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[2]/a")
    private WebElement btnFind;


    public ElementMethodsPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);

    }


    public ElementMethodsPage findBilets(String dayTo, String DayOut, String whereCity, String whereOutCity) {
        findWhere.sendKeys(whereCity);
        chooseWhereCity.click();
        findWhereOut.sendKeys(whereOutCity);
        chooseWhereOutCity.click();
        btnCalendarTo.sendKeys(dayTo);
        neededDayTo.click();
        neededDayTo.sendKeys(DayOut);
        neededDayOut.click();
        btnFind.click();
        return new ElementMethodsPage(driver);

    }


}
