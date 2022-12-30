import java.util.Scanner;

public class P2_Deer_Of_Santa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysGone = Integer.parseInt(scanner.nextLine());
        int availableFood = Integer.parseInt(scanner.nextLine());
        double firstDeerFood = Double.parseDouble(scanner.nextLine());
        double secondDeerFood = Double.parseDouble(scanner.nextLine());
        double thirdDeerFood = Double.parseDouble(scanner.nextLine());

        double sumFirstDeerFood = daysGone * firstDeerFood;
        double sumSecondDeerFood = daysGone * secondDeerFood;
        double sumThirdDeerFood = daysGone * thirdDeerFood;
        double allDeerFood = sumFirstDeerFood + sumSecondDeerFood + sumThirdDeerFood;

        if (allDeerFood < availableFood) {
            double foodLeft = Math.floor(availableFood - allDeerFood);
            System.out.printf("%.0f kilos of food left.", foodLeft);
        } else {
            double foodNeeded = Math.ceil(allDeerFood - availableFood);
            System.out.printf("%.0f more kilos of food are needed.",foodNeeded);
        }
    }
}
