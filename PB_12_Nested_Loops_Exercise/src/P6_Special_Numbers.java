import java.util.Scanner;

public class P6_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        // Да се напише програма, която чете едно цяло число N, въведено от потребителя, и генерира всички възможни
        // "специални" числа от 1111 до 9999. За да бъде "специално" едно число, то трябва да отговаря на следното условие:
        //•	N да се дели на всяка една от неговите цифри без остатък.
        //Пример: при N = 16, 2418 е специално число:
        //•	16 / 2 = 8 без остатък
        //•	16 / 4 = 4 без остатък
        //•	16 / 1 = 16 без остатък
        //•	16 / 8 = 2 без остатък
        for (int startNumber = 1111; startNumber <= 9999; startNumber++) { // проверяваме числата от 1111 до 9999
            boolean isSpecial = false;
            boolean isSpecial2 = true;
            String textNumber = "" + startNumber;// превръщаме всяко число в текст
            for (int i = 0; i <= textNumber.length() - 1; i++) {   // минаваме през всеки символ на текста
                int digit = Integer.parseInt("" + textNumber.charAt(i));
                if (digit == 0) {
                    isSpecial2 = false;
                    break;
                } else if (n % digit == 0) {
                    isSpecial = true;
                } else {
                    isSpecial2 = false;
                }
            }
            if (isSpecial && isSpecial2) {
                System.out.print(startNumber + " ");
            }
        }


    }

}

