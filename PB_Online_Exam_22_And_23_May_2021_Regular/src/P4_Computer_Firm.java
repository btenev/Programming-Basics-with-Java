import java.util.Scanner;

public class P4_Computer_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerCount = Integer.parseInt(scanner.nextLine());
        double ratingAverage = 0;
        double salesMade = 0;

        for (int startCount = 1; startCount <= computerCount; startCount++) {
            int number = Integer.parseInt(scanner.nextLine());
            int rating = number % 10;
            int possibleSales = number / 10;

            switch (rating) {
                case 2:
                    salesMade += 0;
                    ratingAverage += 2;
                    break;
                case 3:
                    ratingAverage += 3;
                    salesMade += possibleSales * 0.50;
                    break;
                case 4:
                    salesMade += possibleSales * 0.70;
                    ratingAverage += 4;
                    break;
                case 5:
                    salesMade += possibleSales * 0.85;
                    ratingAverage += 5;
                    break;
                case 6:
                    salesMade += possibleSales;
                    ratingAverage += 6;
                    break;
            }
        }
        double ratingEnd = ratingAverage / computerCount;
        System.out.printf("%.2f%n", salesMade);
        System.out.printf("%.2f", ratingEnd);
    }
}
