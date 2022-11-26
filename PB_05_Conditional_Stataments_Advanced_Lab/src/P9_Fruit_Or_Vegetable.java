import java.util.Scanner;

public class P9_Fruit_Or_Vegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        // •	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //•	Всички останали са "unknown"

        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")) {
            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
