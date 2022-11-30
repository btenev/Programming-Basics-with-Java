import java.util.Scanner;

public class P9_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Широчина на свободното пространство - цяло число в интервала [1...1000]
        // Дължина на свободното пространство - цяло число в интервала [1...1000]
        // Височина на свободното пространство - цяло число в интервала [1...1000]

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int volumeApartment = width * length * height;
        int volumePackagesTotal = 0;
        boolean freeSpace = true;
        // продължаваме: text != "Done"
        // спираме: text == "Done"
        // повтаряме въвеждане на текс -> превръщане на текст в число
        // събираме числата
        while (!text.equals("Done")) {
            int volumePackages = Integer.parseInt(text);
            volumePackagesTotal += volumePackages;
            if (volumeApartment < volumePackagesTotal) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volumePackagesTotal - volumeApartment));
                freeSpace = false;
                break;
            }
            text = scanner.nextLine();
        }
        if (freeSpace) {
            System.out.printf("%d Cubic meters left.", volumeApartment - volumePackagesTotal);
        }
    }
}
