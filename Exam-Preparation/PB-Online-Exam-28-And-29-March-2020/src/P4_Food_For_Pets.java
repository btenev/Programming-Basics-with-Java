import java.util.Scanner;

public class P4_Food_For_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        double foodEatenDog = 0;
        double foodEatenCat = 0;
        double foodEatenBiscuits = 0;
        int n = 3;

        for (int currentDay = 1; currentDay <= days; currentDay++ ) {
            int dogEat = Integer.parseInt(scanner.nextLine());
            int catEat = Integer.parseInt(scanner.nextLine());
            foodEatenDog += dogEat;
            foodEatenCat += catEat;
            if (currentDay == n) {
                foodEatenBiscuits += (dogEat + catEat) * 0.10;
                n += 3;
            }
        }
        double foodEatenAll = foodEatenCat + foodEatenDog;
        double percentTotalEatenFood = (foodEatenAll / totalFood) * 100;
        double percentEatenDog = (foodEatenDog / foodEatenAll) * 100;
        double percentEatenCat = (foodEatenCat / foodEatenAll) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(foodEatenBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentTotalEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenDog);
        System.out.printf("%.2f%% eaten from the cat.", percentEatenCat);
    }
}
