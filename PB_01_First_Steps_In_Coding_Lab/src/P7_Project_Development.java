import java.util.Scanner;

public class P7_Project_Development {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int totalHours = 3 * projects;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, totalHours, projects);


    }
}
