public class Task6 {
    public static void main(String[] args) {

        int n = 6;
        int milkForOneSmallBidon = 80/6;

        int m = 8;
        int milkForOneBigBidon = milkForOneSmallBidon + 12;

        int milkFor8BigBidon = milkForOneBigBidon * m;

        System.out.println("Amount of milk in 8 big bidons: " + milkFor8BigBidon);
    }
}
