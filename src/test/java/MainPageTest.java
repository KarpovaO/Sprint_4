import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Random;


public class MainPageTest extends BaseTest {
    @Test
    public void testQuestionsBlock() throws InterruptedException {

        Random rand = new Random();
        int questionNum = rand.nextInt(QuestionAnswerData.getAnswerCount());

        By questionPanelSelector = MainPage.getByQuestionHeading(questionNum);
        WebElement questionPanelElement = getElement(questionPanelSelector);
        scrollIntoView(questionPanelElement);

        //Thread.sleep(500);
        // С этой функцией тесты работают.

        //c этой через раз.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        By questionSelector = MainPage.getQuestionSelector(questionNum);
        clickButton(questionSelector);

        By answerSelector = MainPage.getByQuestionPanel(questionNum);
        String actualAnswer = getElementText(answerSelector);

        String expectedAnswer = QuestionAnswerData.getAnswer(questionNum);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
