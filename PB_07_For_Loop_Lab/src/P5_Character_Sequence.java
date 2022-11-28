import java.util.Scanner;

public class P5_Character_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // печатаме символите от текст на дадена позиция
        // повторяме: печатаме символ на дадена позиция
        // начална стойност: o
        // крайна стойност: lenght - 1
        // повторение: увеличаваме с 1
        String input = scanner.nextLine();

        for (int position = 0; position <= input.length() - 1;position++) {
            System.out.println(input.charAt(position));
        }
    }
}
