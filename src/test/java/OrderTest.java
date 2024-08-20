import org.junit.Test;

public class OrderTest extends BaseTest {

    @Test
    public void testOrderUpperButton()  {
        gotoMainPage();
        clickButton(MainPage.BUTTON_ORDER_TOP);

        UserInfo user = TestUserData.getRandomUserInfo();
        RentInfo rent = TestUserData.getRandomRentInfo();
        OrderPage order = new OrderPage(driver);

        order.fillOrder(user, rent);

        order.clickOrderButton();
        order.clickYesButton();
        order.clickViewOrderButton();
    }

    @Test
    public void testOrderDownButton() throws InterruptedException {
        gotoMainPage();

        scrollIntoView(MainPage.BUTTON_ORDER_BOTTOM);
        clickButton(MainPage.BUTTON_ORDER_BOTTOM);

        UserInfo user = TestUserData.getRandomUserInfo();
        RentInfo rent = TestUserData.getRandomRentInfo();
        OrderPage order = new OrderPage(driver);

        order.fillOrder(user, rent);

        order.clickOrderButton();
        order.clickYesButton();
        order.clickViewOrderButton();
    }

}
