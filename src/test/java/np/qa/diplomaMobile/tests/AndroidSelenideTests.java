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
    void mobileTest() {
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

/*    @Test
    void searchTest() {
        step("First onboarding page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Second onboarding page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("New ways to explore"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Third onboarding page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Fourth onboarding page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Send anonymous data"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .setValue("BrowserStack");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }*/
}