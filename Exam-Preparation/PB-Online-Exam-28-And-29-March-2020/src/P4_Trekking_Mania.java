import java.util.Scanner;

public class P4_Trekking_Mania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsClimbers = Integer.parseInt(scanner.nextLine());
        int allClimbers = 0;
        double countMusala = 0;
        double countMonblan = 0;
        double countKilimandjaro = 0;
        double countK2 = 0;
        double countEverest = 0;


        for (int currentGroup = 1; currentGroup <= groupsClimbers; currentGroup++) {
            int groupsMembers = Integer.parseInt(scanner.nextLine());
            allClimbers += groupsMembers;

            if (groupsMembers <= 5) {
                countMusala += groupsMembers;
            } else if (groupsMembers > 5 && groupsMembers <= 12) {
                countMonblan += groupsMembers;
            } else if (groupsMembers > 12 && groupsMembers <= 25 ) {
                countKilimandjaro += groupsMembers;
            } else if (groupsMembers > 25 && groupsMembers <= 40) {
                countK2 += groupsMembers;
            } else if (groupsMembers > 40) {
                countEverest += groupsMembers;
            }
        }
        System.out.printf("%.2f%%%n", countMusala / allClimbers * 100);
        System.out.printf("%.2f%%%n", countMonblan / allClimbers * 100);
        System.out.printf("%.2f%%%n", countKilimandjaro / allClimbers * 100);
        System.out.printf("%.2f%%%n", countK2 / allClimbers * 100);
        System.out.printf("%.2f%%", countEverest / allClimbers * 100);
    }
}
