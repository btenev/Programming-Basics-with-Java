import java.util.Scanner;

public class P3_Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumDeposit = Double.parseDouble(scanner.nextLine());
        int depositMonths = Integer.parseInt(scanner.nextLine());
        double annualPercentageRate = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент) / 12)

        double sum = sumDeposit + depositMonths * ((sumDeposit * (annualPercentageRate * 0.01)) / 12);
        System.out.println(sum);
    }
}
