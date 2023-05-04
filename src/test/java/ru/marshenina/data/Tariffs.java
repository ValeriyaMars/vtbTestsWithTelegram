package ru.marshenina.data;

public enum Tariffs {

    ON_START("На старте"),
    ALL_ON_BUSINESS("Всё по делу"),
    MOST_IMPORTANT("Самое важное"),
    ALL_INCLUSIVE("Всё включено"),
    HIGH_SPEED("Большие обороты");

    private String tariffName;

    Tariffs(String tariffName) {
        this.tariffName = tariffName;
    }

    public String getTariffName() {
        return tariffName;
    }
}
