package omni.gon.tests;


import omni.gon.pages.*;
import org.junit.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.open;


public class E2ELoginTest {
    @Test
    public void RegisterAndLogin(){
        NascarLoginPage loginPage = open("http://nascar.com", NascarLoginPage.class);
        RegistrationForm registerPage = loginPage.register();
        loginPage = registerPage.submitRegistration("nas@mailinator.com", "123123", "123123", "072");
        MyProfile profile = loginPage.goToProfile();
        profile.emailEntered().shouldHave(value("nas@mailinator.com"));
        loginPage = profile.logout();
        }
}

