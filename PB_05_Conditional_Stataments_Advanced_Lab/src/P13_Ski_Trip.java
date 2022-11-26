import java.util.Scanner;

public class P13_Ski_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int stayDays = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String appreciation = scanner.nextLine();


        int nightSpent = stayDays - 1;
        double discountPrice = 0;
        double finalPrice = 0;


        switch (type){
            case "room for one person":
                    discountPrice = nightSpent * 18;
                    break;
            case "apartment":
                if (stayDays < 10) {
                    discountPrice = (nightSpent * 25) * 0.70;
                } else if (stayDays >= 10 && stayDays <=15) {
                    discountPrice = (nightSpent * 25) * 0.65;
                } else if (stayDays > 15) {
                    discountPrice = (nightSpent * 25) * 0.50;
                }
                break;

            case "president apartment":
                if (stayDays < 10) {
                    discountPrice = (nightSpent * 35) * 0.90;
                } else if (stayDays >= 10 && stayDays <=15) {
                    discountPrice = (nightSpent * 35) * 0.85;
                } else if (stayDays > 15) {
                    discountPrice = (nightSpent * 35) * 0.80;
                }
                break;
        }
        if (appreciation.equals("positive")) {
            finalPrice = discountPrice * 1.25;
            System.out.printf("%.2f",finalPrice);
        } else if (appreciation.equals("negative")) {
            finalPrice = discountPrice * 0.90;
            System.out.printf("%.2f",finalPrice);
        }

    }
}
