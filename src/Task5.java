import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        while (true){
            System.out.println("Finding the arithmetic mean task");
            System.out.println("Enter two numbers:");

            Scanner sc = new Scanner(System.in);

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double average = (x + y) / 2;

            System.out.println("Average = " + average);

            System.out.println("To finish program press 0, to continue press 1: ");
            int finishProgram = sc.nextInt();

            if (finishProgram == 0) {
                break;
            }
            if (finishProgram == 1) {
                continue;
            }
        }
    }
}

