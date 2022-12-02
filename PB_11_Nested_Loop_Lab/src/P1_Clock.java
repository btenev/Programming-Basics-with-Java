public class P1_Clock {
    public static void main(String[] args) {

        // Напишете програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред.
        // Часовете трябва да се изписват във формат "{час}:{минути}".

        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59 ; minutes++) {
                System.out.println(hours + ":" + minutes);
            }
        }
    }
}
