package com.github.belovaoa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task3 {

    @Test
    void workDragAndDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a header").shouldHave(text("A"));
        $("#column-b header").shouldHave(text("B"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));

    }
}
