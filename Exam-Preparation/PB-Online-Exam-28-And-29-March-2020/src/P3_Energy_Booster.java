import java.util.Scanner;

public class P3_Energy_Booster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countSets = Integer.parseInt(scanner.nextLine());
        double priceSet = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    priceSet = 112;
                } else if (size.equals("big")) {
                    priceSet = 143.50;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    priceSet = 73.32;
                } else if (size.equals("big")) {
                    priceSet = 98;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    priceSet = 84.20;
                } else if (size.equals("big")) {
                    priceSet = 124;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    priceSet = 40;
                } else if (size.equals("big")) {
                    priceSet = 76;
                }
                break;
        }
        double sumSet = priceSet * countSets;

        if (sumSet >= 400 && sumSet <= 1000){
            sumSet = sumSet * 0.85;
        } else if (sumSet > 1000) {
            sumSet = sumSet * 0.50;
        }
        System.out.printf("%.2f lv.",sumSet);
    }
}
