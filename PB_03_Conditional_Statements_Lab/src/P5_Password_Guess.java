import java.util.Scanner;

public class P5_Password_Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. чете парола (един ред с произволен текст), въведена от потребителя
        // 2. проверяваме - съвпада с фразата "s3cr3t!P@ssw0rd -> "Welcome".
        // 3. в противен случай -> "Wrong password!"
        String password = scanner.nextLine();

        if(password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
