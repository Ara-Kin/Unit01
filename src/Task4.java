import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        System.out.println("Enter x and y to solve {z = ( (a – 3 ) * b / 2) + c :");
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);

    }
}
