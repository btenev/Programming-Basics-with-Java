import java.util.Scanner;

public class P4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int stepsGoal = 10000;
        int totalStepsDone = 0;

        while (totalStepsDone < stepsGoal) {
            String text = scanner.nextLine();
            if (text.equals("Going home")) {
                int walkingHome = Integer.parseInt(scanner.nextLine());
                totalStepsDone += walkingHome;
                break;
            }
            int stepsDone = Integer.parseInt(text);
            totalStepsDone += stepsDone;

        }

        if (totalStepsDone >= stepsGoal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalStepsDone - stepsGoal);
        } else {
            System.out.printf("%d more steps to reach goal.", stepsGoal - totalStepsDone);
        }


    }

}