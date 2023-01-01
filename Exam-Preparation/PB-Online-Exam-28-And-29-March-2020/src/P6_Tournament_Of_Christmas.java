import java.util.Scanner;

public class P6_Tournament_Of_Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int gamesWonTotal = 0;
        int gamesLostTotal = 0;
        double moneyTotal = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            String text = scanner.nextLine();
            double moneyDay = 0;
            int gamesWon = 0;
            int gamesLost = 0;
            while (!text.equals("Finish")) {
                String result = scanner.nextLine();
                switch (result) {
                    case "win":
                        moneyDay += 20;
                        moneyTotal +=20;
                        gamesWon++;
                        gamesWonTotal++;
                        break;
                    case "lose":
                        gamesLost++;
                        gamesLostTotal++;
                        break;
                }
                text = scanner.nextLine();

            }
            if (gamesWon > gamesLost) {
                moneyTotal += moneyDay * 0.10;
            }
        }
        if (gamesWonTotal > gamesLostTotal) {
            moneyTotal += moneyTotal * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f%n", moneyTotal);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyTotal);
        }
    }
}
