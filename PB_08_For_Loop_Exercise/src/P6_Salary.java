import java.util.Scanner;

public class P6_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //•	Заплата - число в интервала [500...1500]

        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isLost = false;

        for (int number = 1; number <= browserTabs; number++) {
            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook")) {
                salary -= 150;
            } else if (siteName.equals("Instagram")) {
                salary -= 100;
            } else if (siteName.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                isLost = true;
                break;
            }
        }
        if (isLost) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
