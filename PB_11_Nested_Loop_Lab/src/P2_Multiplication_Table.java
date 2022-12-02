public class P2_Multiplication_Table {
    public static void main(String[] args) {
        // Отпечатайте на конзолата таблицата за умножение за числата от 1 до 10 във формат:
        //"{първи множител} * {втори множител} = {резултат}".

        for (int n = 1; n <= 10; n++) {
            for (int m = 1; m <= 10; m++) {
                System.out.printf("%d * %d = %d%n", n, m, n*m);
            }
        }
    }
}
