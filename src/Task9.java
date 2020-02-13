import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c,d:\n");

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double z = (a/c) * (b/d) - ((a * b - c)/(c*d));

        System.out.printf("%.4f", z);
        System.out.println("\n" + z);
    }
}
