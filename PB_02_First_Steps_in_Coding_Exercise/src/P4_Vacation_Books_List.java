import java.util.Scanner;

public class P4_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int pagesDay = pagesBook / (pagesHour * days);

        System.out.println(pagesDay);
    }
}
