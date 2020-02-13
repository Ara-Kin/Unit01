import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task13 {
    public static void main(String[] args) {

        double x1 = 10;
        double x2 = 20;
        double x3 = 100;
        double y1 = 30;
        double y2 = 100;
        double y3 = 300;

        double a = sqrt(pow((x2-x1),2) + pow((y2-y1),2));
        double b = sqrt(pow((x3-x1),2) + pow((y3-y1),2));
        double c = sqrt(pow((x3-x2),2) + pow((y3-y2),2));
        double P = a+b+c;
        double p = (a+b+c)/2;
        double S = sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Square: " + S + " Perimeter: " + P);
    }
}
