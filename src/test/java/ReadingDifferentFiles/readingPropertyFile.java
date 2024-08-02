package ReadingDifferentFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readingPropertyFile {
    /*public static void main(String[] args) throws IOException {
        readingPropertyFile rpf = new readingPropertyFile();
        rpf.readPropertyFile();

    }*/

    public void readPropertyFile() throws IOException {
        String parentPath = System.getProperty("user.dir");
        String propertyFilePath = parentPath + "\\src\\test\\resources\\testdata\\GlobalValues.properties";
        System.out.println(propertyFilePath);

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propertyFilePath);
        prop.load(fis);
        System.out.println("URL - " + prop.getProperty("url") );


    }

    public static String readPropertyFiledata(String variableName) throws IOException {
        String parentPath = System.getProperty("user.dir");
        String propertyFilePath = parentPath + "\\src\\test\\resources\\testdata\\GlobalValues.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propertyFilePath);
        prop.load(fis);
        return prop.getProperty(variableName);


    }
}
