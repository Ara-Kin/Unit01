// отсутствие пакета является грубым нарушение code convention
// в остальном каки-то серьезных замечаний по задачам первого юнита нет

public class Task15 {
    public static void main(String[] args) {
// Написать программу, которая выводит на экран первые четыре степени числа π.
        // здесь нельзя объявить
        for (int i = 1; i < 5; i++) {
            double pi = 3.14;
            pi = Math.pow(pi,i);
            System.out.println(pi + " " + i);
        }
    }
}
