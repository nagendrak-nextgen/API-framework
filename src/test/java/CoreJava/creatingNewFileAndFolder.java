package CoreJava;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class creatingNewFileAndFolder {
    private String folderPath;
    @Test(priority = 1)
    public void createFolder() {
        folderPath = "C:\\Family\\Nagendra\\2024-06-19\\Sample_Folder";
        File f = new File(folderPath);
        f.mkdirs();
    }

    @Test(priority = 2)
    public void createFile() throws IOException {
        File f1 = new File(folderPath + "\\index.html");
        File f2 = new File(folderPath + "\\index.txt");
        f1.createNewFile();
        f2.createNewFile();
    }
}
