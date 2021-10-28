import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class secretest {
    @Test
    public  void tests4(){

     WebDriverManager.chromedriver().setup();
     Selenide.open("https://www.facebook.com/");
        $(by("class","_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
        $(by("name","firstname")).setValue("tinatin");
        $(by("name","lastname")).setValue("jishkariani");

        $(by("name","reg_email__")).setValue("tjishk@gmail.com");
        sleep(50);
        $(by("name","reg_email_confirmation__")).click();
        $(by("name","reg_passwd__")).setValue("123123");
        sleep(5000);
        $(by("name","birthday_year")).selectOption(1990);
    }
}
