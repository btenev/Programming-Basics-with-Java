import java.util.Scanner;

public class P1_Agency_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int ticketNumberAdults = Integer.parseInt(scanner.nextLine());
        int ticketNumberKids = Integer.parseInt(scanner.nextLine());
        double ticketPriceAdult = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double totalPriceTicketAdult = (ticketPriceAdult + serviceTax) * ticketNumberAdults;
        double totalPriceTicketKids =  ((ticketPriceAdult * 0.30) + serviceTax) * ticketNumberKids;

        double totalPriceAll = totalPriceTicketAdult + totalPriceTicketKids;
        double profit = totalPriceAll * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, profit);
    }
}
