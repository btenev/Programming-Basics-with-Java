import java.util.Scanner;

public class P6_Barcode_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String startNumber = "" + start;
        String endNumber = "" + end;
        int digitStart1 = Integer.parseInt("" + startNumber.charAt(0));
        int digitStart2 = Integer.parseInt("" + startNumber.charAt(1));
        int digitStart3 = Integer.parseInt("" + startNumber.charAt(2));
        int digitStart4 = Integer.parseInt("" + startNumber.charAt(3));
        int digitEnd1 = Integer.parseInt("" + endNumber.charAt(0));
        int digitEnd2 = Integer.parseInt("" + endNumber.charAt(1));
        int digitEnd3 = Integer.parseInt("" + endNumber.charAt(2));
        int digitEnd4 = Integer.parseInt("" + endNumber.charAt(3));

        for (int one = digitStart1; one <= digitEnd1; one++) {
            for (int two = digitStart2; two <= digitEnd2; two++) {
                for (int three = digitStart3; three <= digitEnd3; three++) {
                    for (int four = digitStart4; four <= digitEnd4; four++) {
                        if ((one % 2 != 0) && (two % 2 != 0) && (three % 2 != 0) && (four % 2 != 0)) {
                            System.out.printf("%d%d%d%d ", one, two, three, four);
                        }
                    }
                }
            }
        }
    }
}