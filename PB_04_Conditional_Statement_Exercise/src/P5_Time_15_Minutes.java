import java.util.Scanner;

public class P5_Time_15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. час и минути въведени от потребителя от 24 часово денонощие
        // 2. добавят се 15 мин
        // 3. ako мин > 59 , minutes = minutes % 60
        //     hour2 +1 + hour 1
        //  . ako hour > 23  hour = (hour % 23) - 1
        // 3. резултатът се отпечатва часове:минути (часове 0-23) (минути 0-59)
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;


        if (minutes > 59) {
            minutes = minutes % 60;
            hour += 1;
        }
        if (hour > 23) {
            hour = (hour % 23) - 1;
        }
        if (minutes <= 9) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);

        }


    }

}
