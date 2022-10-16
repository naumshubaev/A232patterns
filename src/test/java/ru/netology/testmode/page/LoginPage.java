package ru.netology.testmode.page;

import ru.netology.testmode.data.DataGenerator;
import static ru.netology.testmode.data.DataGenerator.Registration.getRegisteredUser;
import static ru.netology.testmode.data.DataGenerator.Registration.getUser;
import static ru.netology.testmode.data.DataGenerator.getRandomLogin;
import static ru.netology.testmode.data.DataGenerator.getRandomPassword;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage registeredUserLogin (DataGenerator.RegistrationDto registeredUser) {
        $("[data-test-id=login] input").setValue(registeredUser.getLogin());
        $("[data-test-id=password] input").setValue(registeredUser.getPassword());
        $("[data-test-id=action-login]").click();
    return new LoginPage();
    }
}
