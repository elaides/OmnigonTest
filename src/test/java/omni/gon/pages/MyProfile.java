package omni.gon.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MyProfile {
    public NascarLoginPage logout(){
        $("input[class='gigya-input-submit logout'][data-screenset-roles='instance']").click();
        return page(NascarLoginPage.class);
    }

    public SelenideElement emailEntered(){
        return $("input[name='profile.email'][data-screenset-roles='instance']");
    }
}

