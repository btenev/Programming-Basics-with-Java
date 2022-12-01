import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата се четат:
        //•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //•	Налични пари - реално число в интервала [0.00...25000.00]
        //След това многократно се четат по два реда:
        //•	Вид действие - текст с възможности "spend" и "save".
        //•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int followingDaySpentMoney = 0;
        int totalDays = 0;
        boolean notEnoughMoney = true;

        while (followingDaySpentMoney < 5) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                followingDaySpentMoney++;
                availableMoney -= sum;
                if (availableMoney - sum < 0) {
                    availableMoney = 0;
                }
            } else if (action.equals("save")) {
                followingDaySpentMoney = 0;
                availableMoney += sum;
            }
            totalDays++;
            if (availableMoney >= neededMoney) {
                notEnoughMoney = false;
                break;
            }
        }
        if (notEnoughMoney) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.",totalDays);
        }
    }
}

