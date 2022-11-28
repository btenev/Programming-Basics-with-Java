import java.util.Scanner;

public class P2_Numbers_N_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for ( n = n; n >= 1; n-- ) {
            System.out.println(n);
        }
    }
}
