package Generic_Functions;

public class BaseClass {
    public static String str_FilePath;
    public static String str_RootPath;
    public static String str_BaseURI;
    static
    {
        str_RootPath = System.getProperty("user.dir");
        //str_FilePath = str_RootPath + "\\src\\main\\java\\Airline_Resources\\FilePaths.json";//System.getProperty("FilePath");
        str_FilePath = str_RootPath + System.getProperty("FilePath");
        System.out.println("File Path in Static Function - "+ str_FilePath);
        str_BaseURI = "https://api.instantwebtools.net/v1/airlines";

    }
}
