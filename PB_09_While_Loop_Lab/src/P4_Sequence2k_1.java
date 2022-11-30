import java.util.Scanner;

public class P4_Sequence2k_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Напишете програма, която чете число n, въведено от потребителя,
        // и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
        // Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.

        int n = Integer.parseInt(scanner.nextLine());

        // начална стойност: 1
        // крайна стойнст: <= n
        // повтаряме: печатане на числа -> Пришмо число *2 + 1
        // увеличаваме с предишно число *2 +1
        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;

        }
    }
}