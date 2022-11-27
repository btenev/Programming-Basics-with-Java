import java.util.Scanner;

public class P8_On_Time_For_The_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = 60 * examHour + examMinutes;
        int arrivalTotalMinutes = 60 * arrivalHour + arrivalMinute;

        if (examTotalMinutes == arrivalTotalMinutes) {
            System.out.printf("On time%n");
        } else if (examTotalMinutes > arrivalTotalMinutes) {
            if (examTotalMinutes - arrivalTotalMinutes <= 30) {
                System.out.printf("On time%n");
                System.out.printf("%d minutes before the start", examTotalMinutes - arrivalTotalMinutes);
            } else {
                System.out.printf("Early%n");
                if (examTotalMinutes - arrivalTotalMinutes < 60) {
                    System.out.printf("%d minutes before the start", examTotalMinutes - arrivalTotalMinutes);
                } else {
                    examHour = (examTotalMinutes - arrivalTotalMinutes) / 60;
                    examMinutes = (examTotalMinutes - arrivalTotalMinutes) % 60;
                    System.out.printf("%d:%02d hours before the start", examHour, examMinutes);
                }
            }
        } else {
            System.out.printf("Late%n");
            if (arrivalTotalMinutes - examTotalMinutes < 60) {
                System.out.printf("%d minutes after the start", arrivalTotalMinutes - examTotalMinutes);
            } else {
                examHour = (arrivalTotalMinutes - examTotalMinutes) / 60;
                examMinutes = (arrivalTotalMinutes - examTotalMinutes) % 60;
                System.out.printf("%d:%02d hours after the start", examHour, examMinutes);
            }
        }
    }
}