import java.util.Scanner;

public class P2_AND_Processors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberProcessors = Integer.parseInt(scanner.nextLine());
        int numberEmploys = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int totalWorkingHours = numberEmploys * 8 * workDays;
        double processorsProduced = Math.floor((totalWorkingHours * 1.0) / 3);

        if (processorsProduced >= numberProcessors) {
            double profit = (processorsProduced - numberProcessors) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double loss = (numberProcessors - processorsProduced) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", loss);
        }
    }
}
