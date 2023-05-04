package ru.marshenina.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.marshenina.data.Tariffs;
import ru.marshenina.data.TariffsPrices;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("tariffs")
public class TariffsPriceTest extends TestBase {

    @Test
    @Feature("Комплексное предложение")
    @Owner("ValeriyaMars")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Комплексное предложение", url = "https://www.vtb.ru/malyj-biznes/komplekt-offer/#complex-id")
    @DisplayName("Проверка стоимости цены тарифа 'На старте'")
    void checkPriceTariffOnStart() {
        step("Открыть страницу с комплексными предложениями", () -> {
            open("/komplekt-offer/#complex-id");
            sleep(5000);
        });

        step("Кликнуть на тариф " + Tariffs.ON_START.getTariffName(), () -> {
            $(".program-button-itemstyles__Description-foundation-kit__sc-13rmifo-2").
                    $(byText(Tariffs.ON_START.getTariffName())).click();
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается тариф " + Tariffs.ON_START.getTariffName(), () -> {
            $(".lgixTm").shouldHave(Condition.text(Tariffs.ON_START.getTariffName()));
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается цена " + TariffsPrices.ON_START_PRICE.getTariffPrice(), () -> {
            $(".gqKZfv").shouldHave(Condition.text(TariffsPrices.ON_START_PRICE.getTariffPrice()));
        });
    }

    @Test
    @Feature("Комплексное предложение")
    @Owner("ValeriyaMars")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Комплексное предложение", url = "https://www.vtb.ru/malyj-biznes/komplekt-offer/#complex-id")
    @DisplayName("Проверка стоимости цены тарифа 'Всё по делу'")
    void checkPriceTariffAllOnBusiness() {
        step("Открыть страницу с комплексными предложениями", () -> {
            open("/komplekt-offer/#complex-id");
            sleep(5000);
        });

        step("Кликнуть на тариф " + Tariffs.ALL_ON_BUSINESS.getTariffName(), () -> {
            $(byText(Tariffs.ALL_ON_BUSINESS.getTariffName())).click();
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается тариф " + Tariffs.ALL_ON_BUSINESS.getTariffName(), () -> {
            $(".lgixTm").shouldHave(Condition.text(Tariffs.ALL_ON_BUSINESS.getTariffName()));
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается цена " + TariffsPrices.ALL_ON_BUSINESS_PRICE.getTariffPrice(), () -> {
            $(".gqKZfv").shouldHave(Condition.text(TariffsPrices.ALL_ON_BUSINESS_PRICE.getTariffPrice()));
        });
    }

    @Test
    @Feature("Комплексное предложение")
    @Owner("ValeriyaMars")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Комплексное предложение", url = "https://www.vtb.ru/malyj-biznes/komplekt-offer/#complex-id")
    @DisplayName("Проверка стоимости цены тарифа 'Самое важное'")
    void checkPriceTariffMostImportant() {
        step("Открыть страницу с комплексными предложениями", () -> {
            open("/komplekt-offer/#complex-id");
            sleep(5000);
        });

        step("Кликнуть на тариф " + Tariffs.MOST_IMPORTANT.getTariffName(), () -> {
            $("[data-id='complex-wrapper']").
                    $(byText(Tariffs.MOST_IMPORTANT.getTariffName())).click();
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается тариф " + Tariffs.MOST_IMPORTANT.getTariffName(), () -> {
            $(".lgixTm").shouldHave(Condition.text(Tariffs.MOST_IMPORTANT.getTariffName()));
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается цена " + TariffsPrices.MOST_IMPORTANT_PRICE.getTariffPrice(), () -> {
            $(".gqKZfv").shouldHave(Condition.text(TariffsPrices.MOST_IMPORTANT_PRICE.getTariffPrice()));
        });
    }

    @Test
    @Feature("Комплексное предложение")
    @Owner("ValeriyaMars")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Комплексное предложение", url = "https://www.vtb.ru/malyj-biznes/komplekt-offer/#complex-id")
    @DisplayName("Проверка стоимости цены тарифа 'Всё включено'")
    void checkPriceTariffAllInclusive() {
        step("Открыть страницу с комплексными предложениями", () -> {
            open("/komplekt-offer/#complex-id");
            sleep(5000);
        });

        step("Кликнуть на тариф " + Tariffs.ALL_INCLUSIVE.getTariffName(), () -> {
            $("[data-id='complex-wrapper']").
                    $(byText(Tariffs.ALL_INCLUSIVE.getTariffName())).click();
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается тариф " + Tariffs.ALL_INCLUSIVE.getTariffName(), () -> {
            $(".lgixTm").shouldHave(Condition.text(Tariffs.ALL_INCLUSIVE.getTariffName()));
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается цена " + TariffsPrices.ALL_INCLUSIVE_PRICE.getTariffPrice(), () -> {
            $(".gqKZfv").shouldHave(Condition.text(TariffsPrices.ALL_INCLUSIVE_PRICE.getTariffPrice()));
        });
    }

    @Test
    @Feature("Комплексное предложение")
    @Owner("ValeriyaMars")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Комплексное предложение", url = "https://www.vtb.ru/malyj-biznes/komplekt-offer/#complex-id")
    @DisplayName("Проверка стоимости цены тарифа 'Большие обороты'")
    void checkPriceTariffHighSpeed() {
        step("Открыть страницу с комплексными предложениями", () -> {
            open("/komplekt-offer/#complex-id");
            sleep(5000);
        });

        step("Кликнуть на тариф " + Tariffs.HIGH_SPEED.getTariffName(), () -> {
            $("[data-id='complex-wrapper']").
                    $(byText(Tariffs.HIGH_SPEED.getTariffName())).click();
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается тариф " + Tariffs.HIGH_SPEED.getTariffName(), () -> {
            $(".lgixTm").shouldHave(Condition.text(Tariffs.HIGH_SPEED.getTariffName()));
        });

        step("Проверить, что в блоке 'Выбранный продукт' отображается цена " + TariffsPrices.HIGH_SPEED_PRICE.getTariffPrice(), () -> {
            $(".gqKZfv").shouldHave(Condition.text(TariffsPrices.HIGH_SPEED_PRICE.getTariffPrice()));
        });
    }
}
