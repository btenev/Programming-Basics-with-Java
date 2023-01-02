import java.util.Scanner;

public class P5_Best_Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int maxScored = 0;
        String currentPlayer = "";

        while (!text.equals("END")) {
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored > maxScored) {
                maxScored = goalsScored;
                currentPlayer = text;
            }
            if (goalsScored >= 10) {
                break;
            }
            text = scanner.nextLine();
        }
        System.out.println(currentPlayer + " is the best player!");
        if (maxScored >= 3) {
            System.out.println("He has scored " + maxScored + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + maxScored + " goals.");
        }
    }
}
