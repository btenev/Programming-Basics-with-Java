import java.util.Scanner;

public class P1_Supplies_For_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penCount = Integer.parseInt(scanner.nextLine());
        int markerCount = Integer.parseInt(scanner.nextLine());
        double cleaningSolutionLiters = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double penPriceAll = penCount * 5.80;
        double markerPriceAll = markerCount * 7.20;
        double cleaningSolutionPriceAll = cleaningSolutionLiters * 1.20;

        double allMaterials = penPriceAll + markerPriceAll + cleaningSolutionPriceAll;
        double discount = (allMaterials * discountPercent) / 100;
        double netPrice = allMaterials - discount;

        System.out.printf("%.3f", netPrice);
    }
}
