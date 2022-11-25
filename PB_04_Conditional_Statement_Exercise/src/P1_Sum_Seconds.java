import java.util.Scanner;

public class P1_Sum_Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. времена на 3 състезатели в секунди, въведени
        // 2. сумиране на секундите и извеждане във формат минути:секунди
        // 3. Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeMinutes = (timeFirst + timeSecond + timeThird) / 60;
        int timeSeconds = (timeFirst + timeSecond + timeThird) % 60;

        if (timeSeconds < 10){
            System.out.printf("%d:0%d",timeMinutes, timeSeconds);
        } else {
            System.out.printf("%d:%d",timeMinutes, timeSeconds);
        }

    }
}
