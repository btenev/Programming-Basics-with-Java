import java.util.Scanner;

public class P2_Weekend_Or_Working_Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. текст от потребител
        // 2. ако деня е работен печатаме -> "Working day"
        //    ако е почивен -> "Weekend".
        //    ако е друг текст различен от дните -> "Error".

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;



        }
    }
}
