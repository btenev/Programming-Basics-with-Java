import java.util.Scanner;

public class P7_Cinema_Tickets_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!film.equals("Finish")) {
            int freeSpace = Integer.parseInt(scanner.nextLine());
            int placesTaken = 0;
            for (int occupiedPlaces = 1; occupiedPlaces <= freeSpace; occupiedPlaces++) {
                String ticket = scanner.nextLine();
                if (ticket.equals("End")){
                    break;
                } else if (ticket.equals("student")) {
                    studentTickets++;
                    placesTaken++;
                } else if (ticket.equals("standard")) {
                    standardTickets++;
                    placesTaken++;
                } else if (ticket.equals("kid")) {
                    kidTickets++;
                    placesTaken++;
                }
            }
            double occupiedSpacePercent = (placesTaken * 1.00 / freeSpace) * 100;
            System.out.printf("%s - %.2f%% full.%n", film, occupiedSpacePercent);

            film = scanner.nextLine();
        }
        int totalTickets = studentTickets + standardTickets + kidTickets;
        System.out.println("Total tickets: " + totalTickets);
        double studentTicketsPercent = (studentTickets * 1.00 / totalTickets) * 100;
        System.out.printf("%.2f%% student tickets.%n", studentTicketsPercent);
        double standardTicketsPercent = (standardTickets * 1.00 / totalTickets) * 100;
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsPercent);
        double kidTicketsPercent = (kidTickets * 1.00 / totalTickets) * 100;
        System.out.printf("%.2f%% kids tickets.", kidTicketsPercent);
    }
}
