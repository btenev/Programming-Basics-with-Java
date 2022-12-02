import java.util.Scanner;
public class P5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double availableMoney = 0;

            while (availableMoney < neededMoney) {
                double moneySaved = Double.parseDouble(scanner.nextLine());
                availableMoney += moneySaved;
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scanner.nextLine();
        }
    }
}
