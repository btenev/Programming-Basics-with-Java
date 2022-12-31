import java.util.Scanner;

public class P5_Christmas_Gifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int countAdults = 0;
        int countKids = 0;

        while (!text.equals("Christmas")) {
            int age = Integer.parseInt(text);
            if (age <= 16) {
                countKids++;
            } else if (age > 16) {
                countAdults++;
            }
            text = scanner.nextLine();
        }
        int moneyForToys = countKids * 5;
        int moneyForSweaters = countAdults * 15;
        System.out.println("Number of adults: " + countAdults);
        System.out.println("Number of kids: " + countKids);
        System.out.println("Money for toys: " + moneyForToys);
        System.out.println("Money for sweaters: " + moneyForSweaters);
    }
}
