import java.util.Scanner;

public class P5_Password_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.
        //•	Символ 1: цифра от 1 до n.
        //•	Символ 2: цифра от 1 до n.
        //•	Символ 3: малка буква измежду първите l букви на латинската азбука.
        //•	Символ 4: малка буква измежду първите l букви на латинската азбука.
        //•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int symbol1 = 1; symbol1 < n; symbol1++) {
            for (int symbol2 = 1; symbol2 < n; symbol2++) {
                for (int firstLetter = 0; firstLetter < l; firstLetter++) {
                    char fL = alphabet.charAt(firstLetter);
                    for (int secondLetter = 0; secondLetter < l; secondLetter++) {
                        char sL = alphabet.charAt(secondLetter);
                        for (int symbol3 = 1; symbol3 <= n; symbol3++) {
                            if (symbol3 > symbol1 && symbol3 > symbol2 ) {
                                System.out.printf("%d%d%c%c%d ", symbol1, symbol2, fL, sL, symbol3);
                            }
                        }
                    }
                }
            }
        }
    }
}
