import java.util.Scanner;

public class P3_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. цяло число , въведено от потребител
        // 2. печата четмо или нечетно -> може да разберем дали едно число е четно ако след деление с две няма остатък

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
