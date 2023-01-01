import java.util.Scanner;

public class P1_Change_Bureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBitcoins = Integer.parseInt(scanner.nextLine());
        double countYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsLeva = countBitcoins * 1168;
        double yuanDollars = countYuan * 0.15;
        double dollarLeva = yuanDollars * 1.76;
        double levaEuro = (bitcoinsLeva + dollarLeva) / 1.95;

        double resultCommission = levaEuro * (commission / 100);
        double finalResult = levaEuro - resultCommission;

        System.out.printf("%.2f",finalResult);
    }
}
