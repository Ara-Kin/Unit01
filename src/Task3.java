import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        System.out.println("Enter x and y to solve {z = 2 * x + ( y – 2 ) * 5} :");
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();

        System.out.print("y = ");
        int y = sc.nextInt();

        int z = 2 * x + ( y - 2 ) * 5;

        System.out.println("z = " + z);
    }
}


