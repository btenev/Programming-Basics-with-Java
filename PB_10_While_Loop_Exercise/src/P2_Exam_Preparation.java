import java.util.Scanner;

public class P2_Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        //•	След това многократно се четат по два реда:
        //o	Име на задача - текст
        //o	Оценка - цяло число в интервала [2…6]

        int unacceptableGradesLimit = Integer.parseInt(scanner.nextLine()); // въведени от потребителя
        String task = scanner.nextLine();
        int unacceptableGradesCount = 0;   // броим
        boolean enough = true;
        int sumGrade = 0;          // събираме всички оценки
        int gradeCount = 0; // броим  оценки
        String notEnough = "";

        while (!task.equals("Enough")) {
            int taskGrade = Integer.parseInt(scanner.nextLine());
            notEnough = task;
            if (taskGrade <= 4) {
                unacceptableGradesCount += 1;
                if (unacceptableGradesCount == unacceptableGradesLimit) {
                    enough = false;
                    break;
                }
            }
            sumGrade += taskGrade;
            gradeCount += 1;
            task = scanner.nextLine();
        }

        if (enough) {
            System.out.printf("Average score: %.2f%n",sumGrade * 1.0 / gradeCount);
            System.out.printf("Number of problems: %d%n",gradeCount);
            System.out.println("Last problem: " + notEnough);

        } else {
            System.out.printf("You need a break, %d poor grades.",unacceptableGradesCount);
        }
    }
}
