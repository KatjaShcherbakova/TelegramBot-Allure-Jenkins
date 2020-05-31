package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Epic("QA.GURU automation course")
@Story("YandexSearch tests")
@Tag("yandex")

class YandexTests extends TestBase {

    @Test
    @Description("We look for Item on Yandex")
    @DisplayName("Positive Test by Search")
    void successfulSearchItem() {
        open(url);

        $("#header-search").setValue(item).pressEnter();
//
        $(".n-snippet-cell2__title").click();
        switchTo().window(1);
        $("html").shouldHave(text(item));


    }
    @Test
    @Description("We look for Item on Yandex, we don`t want it to find ")
    @DisplayName("Negative Test by Search")
    void unsuccessfulSearchItem() {
        open(url);

        $("#header-search").setValue(item).pressEnter();
        $(".n-snippet-cell2__title").click();
        switchTo().window(1);
        $("html").shouldNotHave(text(item));


    }


}

