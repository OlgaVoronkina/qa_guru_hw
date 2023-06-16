package demoqaHW.pages;

import java.io.File;
import static com.codeborne.selenide.Selenide.$;


public class BasePage {

    /**
     * загрузка файла
     * на вход: локатор поля, название файла
     */
    public void uploadFile(String fieldLocator, String fileName){
        File file = new File("src/test/resources/"+fileName+"");
        $(""+fieldLocator+"").uploadFile(file);
    }
}
