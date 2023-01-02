import java.util.Scanner;

public class P4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOtherColors = 0;
        int totalPoints = 0;

        for (int first = 1; first <= n; first++) {
            String ballColour = scanner.nextLine();
            switch (ballColour) {
                case "red":
                    totalPoints += 5;
                    countRed++;
                    break;
                case "orange":
                    totalPoints += 10;
                    countOrange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    countYellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    countWhite++;
                    break;
                case "black":
                    totalPoints /= 2;
                    countBlack++;
                    break;
                default:
                    countOtherColors++;
                    break;

            }
        }
        System.out.println("Total points: " + totalPoints);
        System.out.println("Points from red balls: " + countRed);
        System.out.println("Points from orange balls: " + countOrange);
        System.out.println("Points from yellow balls: " + countYellow);
        System.out.println("Points from white balls: " + countWhite);
        System.out.println("Other colors picked: " + countOtherColors);
        System.out.println("Divides from black balls: " + countBlack);

    }
}






