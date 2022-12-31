import java.util.Scanner;

public class P3_Pastry_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sweet = scanner.nextLine();
        int numberSweet = Integer.parseInt(scanner.nextLine());
        int dayOfDecember = Integer.parseInt(scanner.nextLine());
        double sweetPrice = 0;

        if (dayOfDecember <= 15) {
            switch (sweet) {
                case "Cake":
                    sweetPrice = 24;
                    break;
                case "Souffle":
                    sweetPrice = 6.66;
                    break;
                case "Baklava":
                    sweetPrice = 12.60;
                    break;
            }
        } else {
            switch (sweet) {
                case "Cake":
                    sweetPrice = 28.70;
                    break;
                case "Souffle":
                    sweetPrice = 9.80;
                    break;
                case "Baklava":
                    sweetPrice = 16.98;
                    break;
            }
        }
        double grossPrice = numberSweet * sweetPrice;
        if (dayOfDecember <= 22) {
            if (grossPrice >= 100 && grossPrice <= 200) {
                grossPrice *= 0.85;
            } else if (grossPrice > 200) {
                grossPrice *= 0.75;
            }
        }
        if (dayOfDecember <= 15) {
            grossPrice *= 0.90;
        }
        System.out.printf("%.2f", grossPrice);
    }
}
