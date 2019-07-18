package leavesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LeavesPage {
    WebDriver driver;

    public LeavesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy (linkText = "Leaves Request")
    public WebElement leaveRequestButton;

    @FindBy (xpath = "(//div[@class='fc-bg'])[5]//td[5]")
    public WebElement july31;

    @FindBy (xpath = "//div[@class='o_form_sheet_bg']")
    public WebElement leavesRequestMenu;

    @FindBy (xpath = "//div[@class='o_main_content']")
    public WebElement calendar;

    @FindBy (xpath = "//input[@id='o_field_input_26']")
    public WebElement july31DateInput;


}