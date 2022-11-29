import java.util.Scanner;

public class P1_Numbers_Ending_In_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която отпечатва числата в диапазона [1…1000], които завършват на 7.

        for (int number = 1; number <= 1000; number++) {
            if (number % 10 == 7) {
                System.out.println(number);
            }
        }
    }
}
