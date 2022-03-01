package ru.yandex.qa1.account;

public class Main {
    public static void main(String[] args) {
        ReportValidator reportValidator = new ReportValidator();
        YearlyReport report = new YearlyReport();
        report.year = 2021;
        reportValidator.validate(report);

        System.out.println(report.year);
    }
}
