import java.util.Scanner;

public class P1_Old_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        String randomBook = scanner.nextLine();
        int booksChecked = 0;
        boolean bookFound = true;

        while (!favouriteBook.equals(randomBook)) {  // въртим докато любима книга не стане равно на произволна книга
            if (randomBook.equals("No More Books")) {  // ако получим няма повече книги прекратяваме
                bookFound = false;
                break;
            }
            booksChecked += 1;                       // увеличаваме проверените книги с една
            randomBook = scanner.nextLine();         // вземаме нова книга
        }
        if (bookFound) {
            System.out.printf("You checked %d books and found it.",booksChecked);
        } else {
             System.out.println("The book you search is not here!");
             System.out.printf("You checked %d books.", booksChecked);

        }
    }
}
