import java.util.Scanner;

public class P4_Train_The_Trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
        //След това на отделен ред се прочита името на презентацията - текст
        //За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]

        int juryNumber = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double averageSumAll = 0;
        int countPresentation = 0;


        while (!presentation.equals("Finish")) {  // четем презентации докато не се подаде finish
            countPresentation ++;
            double   gradeSumPresentation = 0;
            for (int gradeNumber = 1; gradeNumber <= juryNumber; gradeNumber++) {  // за всеки член на журито четем по една оценка
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSumPresentation += grade;

            }
            double sumPresentation = gradeSumPresentation / juryNumber;
            averageSumAll += sumPresentation;
            System.out.printf( "%s - %.2f.%n", presentation, sumPresentation);
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",averageSumAll / countPresentation);
    }
}
