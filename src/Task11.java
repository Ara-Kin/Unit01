import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task11 {

    public static void main(String[] args) {

        System.out.println("Enter a,b");

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double S = (a * b) / 2;
        double gipotenuza = sqrt(pow(a,2) + pow(b,2));
        double P = a + b + gipotenuza;

        System.out.println("Square: " + S + "\nPerimeter: " + P);



    }
}