package np.qa.diplomaMobile.tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class AndroidSelenideTests extends TestBase {

    @DisplayName("Мобильные тесты")
    @Test
    void searchTest() {
        step("Перевод", () -> {

            $(AppiumBy.id("ru.yandex.translate:id/et_input_field")).setValue("layer");
            $(AppiumBy.id("ru.yandex.translate:id/tv_translation")).shouldHave(Condition.text("слой"));

        });

        step("Смена языка", () -> {

            $(AppiumBy.id("ru.yandex.translate:id/tv_translate_target_lang")).click();
            $(AppiumBy.id("ru.yandex.translate:id/inputField")).setValue("ukrainian");
            $(AppiumBy.id("ru.yandex.translate:id/tv_title_lang")).click();
            $(AppiumBy.id("ru.yandex.translate:id/tv_translate_target_lang")).shouldHave(Condition.text("ukrainian"));
        });

        step("Переход в настройки", () -> {

            $(AppiumBy.id("ru.yandex.translate:id/settingsButton")).click();
            $(AppiumBy.id("ru.yandex.translate:id/tv_title")).shouldHave(Condition.text("Settings"));

        });
    }

}