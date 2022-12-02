import java.util.Scanner;

public class P3_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
        //x1 + x2 + x3 = n
        //Числото n е цяло число и се въвежда от конзолата.

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    if (x1 + x2 + x3 == n) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
