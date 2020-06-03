package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static helpers.Environment.*;

    @Epic("QA guru")
    @Story("TinkoffBank Tests")
    @Tag("tinkoff")

public class TinkoffTest extends TestBase {



    @Test
    @Description("Search on TinkoffBank WebPage")
    @DisplayName("Positive Test, we are looking for the text")

    void clickButton() {

        open(urlTinkoffBank);

        $(by("href","/deposit/")).click();

        $(byText("Открыть вклад")).shouldBe(Condition.visible);


    }
}