import java.util.Random;

public class TestUserData {
    private static final UserInfo[] USER_INFOS = {
            new UserInfo("Иван", "Иванов", "г. Москва, ул. Петрова, д.1", "1", "79138098111"),
            new UserInfo("Иван", "Петров", "г. Москва, ул. Петрова, д.1", "2", "79148098111"),
            new UserInfo("Иван", "Сидоров", "г. Москва, ул. Петрова, д.1", "3", "79158098111"),
            new UserInfo("Няша", "Няшная", "г. Москва, ул. Лубянка, подвал", "4", "79165098111")
    };

    private static final RentInfo[] RENT_INFOS = {
            new RentInfo("10.08.2024", "1", SamokatColor.GRAY),
            new RentInfo("16.07.1984", "5", SamokatColor.BLACK),
    };

    private static final Random RAND = new Random();

    public static UserInfo getRandomUserInfo() {
        int userIndex = RAND.nextInt(USER_INFOS.length);
        return USER_INFOS[userIndex];
    }

    public static RentInfo getRandomRentInfo() {
        int rentIndex = RAND.nextInt(RENT_INFOS.length);
        return RENT_INFOS[rentIndex];
    }

}
