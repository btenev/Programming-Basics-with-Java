import java.util.Scanner;

public class P6_Area_Of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. въвежда се тайп в конзола
        // 2. ако типа е  квадрат числото което се въвежда е страна.   А = а * a
        //    ако типа е  правоъгълник се въвеждат дължините на страните му А = а * b
        //    ако типа е  кръг се въвежда радиус   A = пи * r2
        //    ако типа е  триъгълник височина и дължина на страна A = (a * b) / 2
        // 3. Печатаме резукатат закръглен до 3 цифра след десетична точка

        String type = scanner.nextLine();

        if (type.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        } else if (type.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        } else if (type.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * Math.pow(r, 2);
            System.out.printf("%.3f", area);
        } else if (type.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b) / 2;
            System.out.printf("%.3f", area);
        }
    }
}
