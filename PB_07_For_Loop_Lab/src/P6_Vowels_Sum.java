import java.util.Scanner;

public class P6_Vowels_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете текст (стринг), въведен от потребителя,
        // и изчислява и отпечатва сумата от стойностите на гласните букви според таблицата

        // печатаме символите от текст на дадена позиция и съхраняваме за да сравним
        // повторяме: ako символ е равен на ........ броим
        // начална стойност: o
        // крайна стойност: lenght - 1
        // повторение: увеличаваме с 1


        String text = scanner.nextLine();

        int total = 0;

        for (int position = 0; position <= text.length() - 1; position++ ) {
            char symbol = text.charAt(position);
            switch (symbol) {
                case 'a':
                    total += 1;
                    break;
                case 'e':
                    total += 2;
                    break;
                case 'i':
                    total += 3;
                    break;
                case 'o':
                    total += 4;
                    break;
                case 'u':
                    total += 5;
                    break;
            }
        }
        System.out.println(total);
    }
}
