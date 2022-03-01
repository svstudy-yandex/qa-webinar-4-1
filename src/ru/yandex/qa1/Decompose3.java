package ru.yandex.qa1;

public class Decompose3 {

    public static void main(String[] args) {
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        analizeMeal("Пиксель", feedExpensesCat);
        analizeMeal("Байт", feedExpensesHamster);
    }

    public static void analizeMeal(String name, double[] expenses) {
        sayHello(name);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(expenses));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(expenses));
        sayEnjoyMeal(name);
    }


    public static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    public static double findMaxExpense(double[] expenses) {
        double maxFeedExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxFeedExpense) {
                maxFeedExpense = expenses[i];
            }
        }
        return maxFeedExpense;
    }

    public static double findExpensesSum(double[] expenses) {
        double sumFeed = 0;
        for (int i = 0; i < expenses.length; i++) {
            sumFeed = sumFeed + expenses[i];
        }
        return sumFeed;
    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");
    }
}
