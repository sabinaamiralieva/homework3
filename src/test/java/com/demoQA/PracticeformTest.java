package com.demoQA;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeformTest {

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Mihail");
        $("#lastName").setValue("Shabalkin");
        $("#userEmail").setValue("Shabalkin@ya.ru");
        $("#userNumber").setValue("1234567890");
        $("#uploadPicture").uploadFile(new File("src/main/resources/Screenshot_9.png"));
        $(By.xpath("//*[@for=\"gender-radio-1\"]")).click();

    }
}
