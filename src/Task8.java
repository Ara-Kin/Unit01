import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Enter a,b,c:\n");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double z = (b +(sqrt(pow(b,2) + 4 * a * c)))/(2 * a) - (pow(a,3) * c + pow(b, -2));

        System.out.println(z);
    }
}
