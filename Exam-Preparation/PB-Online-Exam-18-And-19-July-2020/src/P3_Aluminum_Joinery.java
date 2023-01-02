import java.util.Scanner;

public class P3_Aluminum_Joinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberWindowFrame = Integer.parseInt(scanner.nextLine());
        String typeWindowFrame = scanner.nextLine();
        String text = scanner.nextLine();

        double singlePrice = 0;
        int delivery = 0;
        boolean valid = true;

        if (numberWindowFrame <= 10) {
            valid = false;
        }

        switch (typeWindowFrame) {
            case "90X130":
                if (numberWindowFrame > 30 && numberWindowFrame <= 60) {
                    singlePrice = 110 * 0.95;
                } else if (numberWindowFrame > 60) {
                    singlePrice = 110 * 0.92;
                } else {
                    singlePrice = 110;
                }
                break;
            case "100X150":
                if (numberWindowFrame > 40 && numberWindowFrame <= 80) {
                    singlePrice = 140 * 0.94;
                } else if (numberWindowFrame > 80) {
                    singlePrice = 140 * 0.90;
                } else {
                    singlePrice = 140;
                }
                break;
            case "130X180":
                if (numberWindowFrame > 20 && numberWindowFrame <= 50) {
                    singlePrice = 190 * 0.93;
                } else if (numberWindowFrame > 50) {
                    singlePrice = 190 * 0.88;
                } else {
                    singlePrice = 190;
                }
                break;
            case "200X300":
                if (numberWindowFrame > 25 && numberWindowFrame <= 50) {
                    singlePrice = 250 * 0.91;
                } else if (numberWindowFrame > 50) {
                    singlePrice = 250 * 0.86;
                } else {
                    singlePrice = 250;
                }
                break;
        }
        if (text.equals("With delivery")) {
            delivery = 60;
        }

        double price = (singlePrice * numberWindowFrame) + delivery;

        if (numberWindowFrame > 99) {
            price *= 0.96;
        }

        if (valid) {
            System.out.printf("%.2f BGN", price);
        } else {
            System.out.println("Invalid order");
        }
    }
}
