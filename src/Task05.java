package Unit01_firstTasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 int:\n");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a+b+c+d;

        System.out.println("Sum:=" + sum);
    }
}
