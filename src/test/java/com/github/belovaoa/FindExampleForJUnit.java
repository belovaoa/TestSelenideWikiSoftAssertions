package com.github.belovaoa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindExampleForJUnit {


    @Test
    void findExampleOnPageSoftAssertions() {

        // Open page selenide in github
        open("https://github.com/selenide/selenide");

        // go on page wiki of this project
        $("#wiki-tab").click();

        // on this page should be SoftAssertions
        $(".markdown-body").shouldHave(text("Soft assertions"));

        // open page SoftAssertions
        $(".markdown-body").$(byText("Soft assertions")).click();

        // this is page SoftAssertions
        $("#wiki-wrapper").shouldHave(text("SoftAssertions"));

        // here should be visible example for JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}
