import java.util.Scanner;

public class P5_Care_Of_Puppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableFoodKg = Integer.parseInt(scanner.nextLine());
        int availableFoodGr = availableFoodKg * 1000;
        String text = scanner.nextLine();
        int foodConsumedTotal = 0;


        while (!text.equals("Adopted")) {
            int foodConsumed = Integer.parseInt(text);
            foodConsumedTotal += foodConsumed;
            text = scanner.nextLine();
        }

        if (availableFoodGr >= foodConsumedTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", availableFoodGr - foodConsumedTotal);
        } else {
            System.out.printf("Food is not enough. You need %d grams more." , foodConsumedTotal - availableFoodGr);
        }
    }
}
