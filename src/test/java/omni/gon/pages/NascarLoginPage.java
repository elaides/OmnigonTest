package omni.gon.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.StaleElementReferenceException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class NascarLoginPage {
    public RegistrationForm register(){
        $("#registerOrLogin .gigyaRegisterDialog").click();
        return page(RegistrationForm.class);
    }

    public MyProfile goToProfile(){
        SelenideElement myProfileLink = $("#myProfileLink");
        while (!myProfileLink.isDisplayed()){
            try {myProfileLink.click();}
            catch (StaleElementReferenceException e) {
                myProfileLink.click();
            }
        }
        return page(MyProfile.class);
    }
}
