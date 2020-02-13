import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter a to solve c = 3 + a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 3 + a;
        System.out.println("c = " + c);
    }
}