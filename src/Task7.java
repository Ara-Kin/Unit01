import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника]

        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();

        double width = length/2;
        double square = width * length;

        System.out.println("Square = " + square);
    }
}
