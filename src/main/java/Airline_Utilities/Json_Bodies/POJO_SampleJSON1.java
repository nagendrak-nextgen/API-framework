package Airline_Utilities.Json_Bodies;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
public class POJO_SampleJSON1 {
    //Youtube Video 19 - https://www.youtube.com/watch?v=FO2ipL0v7sI&list=PL-a9eJ2NZlbRFnZbN8glYFGaEudds86-k&index=19
    //private String gender = Stream.of("Male","Female","Others").findAny().get();
    //private String gender = Arrays.asList("Male","Female","Others").get(RandomDataGenerator.getRandomNumber(0,3));
    private int id = 2024;
    private String name = "Nagenrda";
    private String country = "India";
    private String logo = "Gherkin Writer";
    private String slogan = "Never Loos Hope";
    private String head_quaters = "Bangalore";
    private String website = "https://www.Gherkinwritingutility.com";
    private int established = 2022;
}
