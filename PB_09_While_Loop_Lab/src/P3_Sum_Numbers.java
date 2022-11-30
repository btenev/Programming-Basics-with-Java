import java.util.Scanner;

public class P3_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        // въвеждаме цяло цяло число
        // повтаряме : въвеждане на числа и сумираме
        // краина стойност: sum >= на въведенето число
        // продължаваме sum < number
        // променяме: ново число
        int sum = 0;

        while (sum < number) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }
        System.out.println(sum);
    }
}
