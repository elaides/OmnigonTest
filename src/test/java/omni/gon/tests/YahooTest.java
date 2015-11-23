package omni.gon.tests;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class YahooTest {
    @Test
    public void yahooTest() {
        open("http://yahoo.com");
        ElementsCollection sites = $$(".ell.fz-s i");
        int i = 0;
        while (i < sites.size()) {
            sites.get(i).click();
            i++;
            try {
                new WebDriverWait(getWebDriver(), 7).until(ExpectedConditions.titleContains("Yahoo"));
            } catch (TimeoutException e) {
                String title = getWebDriver().getTitle();
                System.out.println(title);
            }
            back();
        }
    }
}

