import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public static final By BUTTON_ORDER_TOP = By.xpath("//button[@class='Button_Button__ra12g']");
    public static final By BUTTON_ORDER_BOTTOM = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static By getQuestionSelector(int questionNumber) {
        String id = String.format("accordion__heading-%d", questionNumber);
        String xpath = String.format("//div[@id='%s']", id);
        return By.xpath(xpath);
    }

    public static By getByQuestionHeading(int questionNumber) {
        String id1 = String.format("accordion__heading-%d", questionNumber);
        String xpath = String.format("//div[@id='%s']/parent::*/parent::*", id1);
        return By.xpath(xpath);
    }

    public static By getByQuestionPanel(int questionNumber) {
        String id2 = String.format("accordion__panel-%d", questionNumber);
        return By.id(id2);
    }


}
