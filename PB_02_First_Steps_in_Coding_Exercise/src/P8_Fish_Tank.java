import java.util.Scanner;

public class P8_Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = lengthCm * widthCm * heightCm;
        double netVolume = volume -(volume * (percent * 0.01));


        double litres = netVolume * 0.001;
        System.out.printf("%.2f",litres);

    }
}
