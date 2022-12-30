import java.util.Scanner;

public class P1_Cat_Diet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbohydratesPercent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double totalGramsFat = totalCalories * (fatPercent / 100.0) / 9;
        double totalGramsProtein = totalCalories * (proteinPercent / 100.0) / 4;
        double totalGramsCarbohydrates = totalCalories * (carbohydratesPercent / 100.0) / 4;

        double totalWeight = totalGramsFat + totalGramsProtein + totalGramsCarbohydrates;
        double caloriesGram = totalCalories / totalWeight;
        double water = caloriesGram * waterPercent / 100.0;
        double caloriesNet = caloriesGram - water;
        System.out.printf("%.4f", caloriesNet);
    }
}
