import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class firtstest {
    @Test
    public  void test1(){
        WebDriverManager.chromedriver().setup();
           open("https://www.facebook.com/");
           $(By.xpath("//*[@id=\"SBmmZd\"]/a[2]"));
    }
}
