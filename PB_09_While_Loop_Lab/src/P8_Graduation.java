import java.util.Scanner;

public class P8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int course = 1;
        int failed = 0;
        boolean hasGraduated = true;
        double schoolGradeAverage = 0;

        while (course <= 12) {
            Double schoolGrade = Double.parseDouble(scanner.nextLine());
            schoolGradeAverage += schoolGrade;
            if (schoolGrade < 4) {
                failed += 1;
                if (failed > 0) {
                    hasGraduated = false;
                    System.out.printf("%s has been excluded at %d grade", name, course);
                    break;
                }
            }
            course++;
        }
        if (hasGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", name, schoolGradeAverage / 12);
        }
    }

}

