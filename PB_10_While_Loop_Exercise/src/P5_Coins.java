import java.util.Scanner;

public class P5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double changeInStotinki = Math.round(changeInLeva * 100);
        int coinsCount = 0;
        // възможни монети - 1ст, 2ст, 5ст, 10ст, 20ст, 50ст, 1 лев, 2лева

        while (changeInStotinki > 0) {
            if (changeInStotinki >= 200) {
                changeInStotinki -= 200;
                coinsCount += 1;
            } else if (changeInStotinki >= 100) {
                changeInStotinki -= 100;
                coinsCount += 1;
            } else if (changeInStotinki >= 50) {
                changeInStotinki -= 50;
                coinsCount += 1;
            } else if (changeInStotinki >= 20) {
                changeInStotinki -= 20;
                coinsCount += 1;
            } else if (changeInStotinki >= 10) {
                changeInStotinki -= 10;
                coinsCount += 1;
            } else if (changeInStotinki >= 5) {
                changeInStotinki -= 5;
                coinsCount += 1;
            } else if (changeInStotinki >= 2) {
                changeInStotinki -= 2;
                coinsCount += 1;
            } else if (changeInStotinki >= 1) {
                changeInStotinki -= 1;
                coinsCount += 1;
            }
        }
        System.out.println(coinsCount);
    }
}
