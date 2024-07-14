package Generic_Functions;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {
    static Faker fobject = new Faker();
    public static String getRandomDataFor(Enum_RandomDataTypeNames dataTypeNames) {

        switch (dataTypeNames){
            case FIRSTNAME:
                return fobject.name().firstName();
            case LASTNAME:
                return fobject.name().lastName();
            case FULLNAME:
                return fobject.name().fullName();
            case COUNTRY:
                return fobject.address().country();
            case CITYNAME:
                return fobject.address().cityName();
            default:
                return "This option doesnot exist in this case statement";
        }
    }

    public static String getRandomNumber(int count) {
        return fobject.number().digits(count);
    }
    public static String getRandomAlphabets(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static int getRandomNumber(int num1, int num2) {
        return fobject.number().numberBetween(num1, num2);
    }
}
