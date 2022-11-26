import java.util.Scanner;

public class P12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissionPercentage = 0.0;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commissionPercentage = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercentage = 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercentage = 0.08;
                } else if (sales > 10000) {
                    commissionPercentage = 0.12;
                } else {
                    System.out.println("error");
                }
                break;
            case"Varna":
                if (sales >= 0 && sales <= 500) {
                    commissionPercentage = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercentage = 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercentage = 0.10;
                } else if (sales > 10000) {
                    commissionPercentage = 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            case"Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commissionPercentage = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercentage = 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commissionPercentage = 0.12;
                } else if (sales > 10000) {
                    commissionPercentage = 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if ((sales > 0) && (city.equals("Sofia") || city.equals("Varna") || city.equals("Plovdiv"))) {
            double commission = commissionPercentage * sales;
            System.out.printf("%.2f",commission);
        }
    }
}
