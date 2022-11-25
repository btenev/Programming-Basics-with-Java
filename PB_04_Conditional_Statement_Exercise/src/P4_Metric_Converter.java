import java.util.Scanner;

public class P4_Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String unitEntry = scanner.nextLine();
        String unitOutput = scanner.nextLine();

        if (unitEntry.equals("mm")) {
            number = number / 1000;
        } else if (unitEntry.equals("cm")) {
            number = number / 100;
        }

        if (unitOutput.equals("mm")) {
            number = number * 1000;
        } else if (unitOutput.equals("cm")) {
            number = number * 100;
        }
        System.out.printf("%.3f", number);
    }
}
