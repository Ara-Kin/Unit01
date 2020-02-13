import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task12 {
    public static void main(String[] args) {
       // Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

        double x1 = 1;
        double x2 = 2;
        double y1 = 3;
        double y2 = 100;

        double S = sqrt((pow((x2 - x1), 2)) + pow((y2 - y1), 2));

        System.out.println(S);
    }
}
