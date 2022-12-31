import java.util.Scanner;

public class P4_Gifts_From_Santa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int start = m; start >= n; start--) {
            if (start % 2 == 0 && start % 3 == 0) {
                if (start == s) {
                    break;
                } else {
                    System.out.printf("%d ", start);
                }
            }
        }
    }
}
