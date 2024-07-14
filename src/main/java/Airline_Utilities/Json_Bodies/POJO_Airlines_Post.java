package Airline_Utilities.Json_Bodies;

import Generic_Functions.Enum_RandomDataTypeNames;
import Generic_Functions.GenericFunctions;
import Generic_Functions.RandomDataGenerator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Arrays;
import java.util.stream.Stream;

/*@Data
@Builder
public class POJO_Airlines_Post {
    //Youtube Video 19 - https://www.youtube.com/watch?v=FO2ipL0v7sI&list=PL-a9eJ2NZlbRFnZbN8glYFGaEudds86-k&index=19
    private int id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String head_quaters;
    private String website;
    private int established;
}
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder (toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class POJO_Airlines_Post {
    //Youtube Video 19 - https://www.youtube.com/watch?v=FO2ipL0v7sI&list=PL-a9eJ2NZlbRFnZbN8glYFGaEudds86-k&index=19
    //private String gender = Stream.of("Male","Female","Others").findAny().get();
    //private String gender = Arrays.asList("Male","Female","Others").get(RandomDataGenerator.getRandomNumber(0,3));
    //private int id = Integer.parseInt(RandomDataGenerator.getRandomNumber(6));
    private int id=1234;
    private String name = RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.FIRSTNAME);
    private String country = RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.COUNTRY);
    private String logo = RandomDataGenerator.getRandomAlphabets(25);
    private String slogan = RandomDataGenerator.getRandomAlphabets(20);
    private String head_quaters = RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.CITYNAME);
    private String website = "https://www." + RandomDataGenerator.getRandomAlphabets(10) + ".com";
    private String established = String.valueOf(RandomDataGenerator.getRandomNumber(1990, GenericFunctions.getcurrentyear()));
}