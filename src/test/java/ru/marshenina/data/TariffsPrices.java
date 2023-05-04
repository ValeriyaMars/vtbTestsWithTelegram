package ru.marshenina.data;

public enum TariffsPrices {

    ON_START_PRICE("0 ₽ / мес"),
    ALL_ON_BUSINESS_PRICE("578 ₽ / мес"),
    MOST_IMPORTANT_PRICE("1 088 ₽ / мес"),
    ALL_INCLUSIVE_PRICE("1 700 ₽ / мес"),
    HIGH_SPEED_PRICE("5 950 ₽ / мес");

    private String tariffPrice;

    TariffsPrices(String tariffPrice) {
        this.tariffPrice = tariffPrice;
    }

    public String getTariffPrice() {
        return tariffPrice;
    }
}
