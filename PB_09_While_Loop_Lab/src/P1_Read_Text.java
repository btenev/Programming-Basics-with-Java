import java.util.Scanner;

public class P1_Read_Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // начална стойност: текст въведен от потребител
        // повтаряме: печатане на текст
        // спираме: когато текс == стоп
        // продължаваме когато текст != стоп
        // променяме: нов текст въведен от потребител

        String text = scanner.nextLine();

        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}
