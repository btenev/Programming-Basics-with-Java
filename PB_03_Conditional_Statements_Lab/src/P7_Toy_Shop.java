import java.util.Scanner;

public class P7_Toy_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Въвежда се цена на екскурия, реално число
        //   Въвежда се брой пъзели
        //   Въвежда се брой говорещи кукли
        //   Въвежда се брой плюшени мечета
        //   Въвежда се брой миньони
        //   Въвежда се брой камиончета
        // 2.Пресмятаме обща цена на пъзели
        //   Пресмятаме обща цена на говорещи кукли
        //   Пресмятаме обща цена на плющени мечета
        //   Пресмятаме обща цена на миньони
        //   Пресмятаме обща цена на камиончета
        // 3.Пресмятаме обща цена на всички играчки
        // 4.Пресмятаме обща бройка пъзели + говорещи кукли + плющени мечета + миньони + камиончета
        // 5.Ако бройка > 50 , Печалба = обща цена на всики играчки - обща цена на всички играчки * 0.25
        //   иначе печалба = обща цена на всички играчки
        // 6. Чиста печалба = Печалба - печалба * 0.10
        // 7. Ако Чиста печалба > цена на екскурзия -> o	"Yes! {оставащите пари} lv left."
        //    иначе o	"Not enough money! {недостигащите пари} lv needed."

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int jigsawNumber = Integer.parseInt(scanner.nextLine());
        int talkingDollsNumber = Integer.parseInt(scanner.nextLine());
        int teddyBearsNumber = Integer.parseInt(scanner.nextLine());
        int minionsNumber = Integer.parseInt(scanner.nextLine());
        int trucksNumber = Integer.parseInt(scanner.nextLine());

        double sumJigsaw = jigsawNumber * 2.60;
        double sumTalkingDolls = talkingDollsNumber * 3;
        double sumTeddyBears = teddyBearsNumber * 4.10;
        double sumMinions = minionsNumber * 8.20;
        double sumTrucks = trucksNumber * 2;

        double priceAllToys = sumJigsaw + sumTalkingDolls + sumTeddyBears + sumMinions + sumTrucks;
        int NumberAllToys = jigsawNumber + talkingDollsNumber + teddyBearsNumber + minionsNumber + trucksNumber;

        if (NumberAllToys >= 50) {
            double revenue = priceAllToys - (priceAllToys * 0.25);
            double netRevenue = revenue - (revenue * 0.10);

            if (netRevenue >= tripPrice) {
                double LeftSum = netRevenue - tripPrice;
                System.out.printf("Yes! %.2f lv left.", LeftSum);
            } else {
                double missSum = tripPrice - netRevenue;
                System.out.printf("Not enough money! %.2f lv needed.", missSum);
            }

        } else {
            double revenue = priceAllToys;
            double netRevenue = revenue - (revenue * 0.10) ;

            if (netRevenue >= tripPrice) {
                System.out.printf("Yes! %.2f lv left.", netRevenue);
            } else {
                double missSum = tripPrice - netRevenue;
                System.out.printf("Not enough money! %.2f lv needed.", missSum);
            }

        }
    }
}
