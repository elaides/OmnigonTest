package omni.gon.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationForm {
    public void enterEmail(String email){
        $("input[name='email'][data-screenset-roles='instance']").setValue(email);
    }

    public void enterPassword(String pass){
        $("input[name='password'][data-screenset-roles='instance']").setValue(pass);
    }

    public void repeatPassword(String pass2){
        $("input[name='passwordRetype'][data-screenset-roles='instance']").setValue(pass2);
    }

    public void enterZipCode(String zipCode){
        $("input[name='profile.zip'][data-screenset-roles='instance']").setValue(zipCode);
    }

    public void clickSubmit(){
        $(".gigya-input-submit").click();
    }

    public NascarLoginPage submitRegistration(String email, String pass, String pass1, String zip){
        enterEmail(email);
        enterPassword(pass);
        repeatPassword(pass1);
        enterZipCode(zip);
        clickSubmit();
        return page(NascarLoginPage.class);
    }

    public SelenideElement pageNaming(){
        return $(".gigya-screen-dialog-caption small");
    }
}
