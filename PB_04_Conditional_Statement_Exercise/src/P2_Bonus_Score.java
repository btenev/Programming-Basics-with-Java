import java.util.Scanner;

public class P2_Bonus_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. въвежда се цяло число , брой точки
        // 2. Ако числото е до 100 включително, бонус точките са 5.
        //	  Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //    Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        // 3. Допълнителни бонус точки (начисляват се отделно от предходните):
        //    За четно число  + 1 т.
        //    За число, което завършва на 5  + 2 т.
        // 4. бонус точките, които получава числото и общия брой точки (числото + бонуса).

        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0;

        if (points <=100) {
            bonusPoints = 5;
        } else if (points > 1000) {
            bonusPoints = points * 0.10;
        } else {
            bonusPoints = points * 0.20;
        }

        if (points % 2 == 0) {
            bonusPoints +=1;
        } else if (points % 10 == 5) {
            bonusPoints +=2;
        }
        System.out.println(bonusPoints);
        System.out.println(points+bonusPoints);
    }

}
