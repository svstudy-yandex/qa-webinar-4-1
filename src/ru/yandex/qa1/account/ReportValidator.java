package ru.yandex.qa1.account;

public class ReportValidator {

    public boolean validate(YearlyReport yearlyReport) {
        if (yearlyReport != null) {
            yearlyReport.year = 2022;
        }
        return true;
    }
}
