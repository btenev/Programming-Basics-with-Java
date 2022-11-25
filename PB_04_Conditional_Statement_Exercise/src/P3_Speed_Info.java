import java.util.Scanner;

public class P3_Speed_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. конзола реално число скорост
        // 2. 10 <=  -> slow; скорост над 10 и до 50 -> average; над 50 и до 150 -> “fast”;
        //    скорост над 150 и до 1000 -> “ultra fast”; При по-висока скорост -> “extremely fast”.

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 1000) {
            System.out.println("ultra fast");
        } else
            System.out.println("extremely fast");
    }
}
