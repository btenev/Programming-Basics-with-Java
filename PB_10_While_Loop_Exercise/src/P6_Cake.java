import java.util.Scanner;

public class P6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        boolean noMore = true;
        int area = width * length;

        while (area > 0) {
            String text = scanner.nextLine();
            if (text.equals("STOP")) {
                noMore = false;
                break;

            }
            int piecesCount = Integer.parseInt(text);
            area -= piecesCount;
        }
        if (noMore) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
        } else {
            System.out.printf("%d pieces are left.", area);
        }


    }
}
