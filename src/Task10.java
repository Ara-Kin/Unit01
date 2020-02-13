import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Enter x,y:\n");

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();


        double z = (sin(x) + cos(y))/(cos(x) - sin(y)) * tan(x*y);

        System.out.printf("%.4f", z);
        System.out.println("\n" + z);
    }
}
