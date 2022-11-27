import java.util.Scanner;

public class P1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        //Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа),
        // въведени от потребителя, и изчислява общите приходи от билети при пълна зала.
        // Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns =  Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        switch (typeProjection) {
            case "Premiere":
                ticketPrice = 12;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5;
                break;
        }
        double totalRevenue = (rows * columns) * ticketPrice;

        System.out.printf("%.2f leva",totalRevenue);
    }
}
