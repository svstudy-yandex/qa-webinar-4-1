package ru.yandex.qa1.tracker;

public class StepTracker {
    private Converter converter = new Converter();

    public void test() {
        int steps = 100;
        double kilometers = converter.stepsToKilometers(steps);

    }

}
