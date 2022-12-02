import java.util.Scanner;

public class P6_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int currentFloor = floors; currentFloor >= 1; currentFloor--) {
            if (currentFloor == floors) {         // последен етаж
                for (int currentApartment = 0; currentApartment <= rooms - 1; currentApartment++) {   // обхождаме апартаменти
                    if (currentApartment == rooms - 1) {
                        System.out.printf("L%d%d%n", currentFloor, currentApartment);
                    } else {
                        System.out.printf("L%d%d ", currentFloor, currentApartment);
                    }
                }
            } else if (currentFloor % 2 == 0) {    // четен етаж
                for (int currentOffice = 0; currentOffice <= rooms - 1; currentOffice++) {      // обхождаме офиси
                    if (currentOffice == rooms - 1) {
                        System.out.printf("O%d%d%n", currentFloor, currentOffice);
                    } else {
                        System.out.printf("O%d%d ", currentFloor, currentOffice);
                    }

                }
            } else {                        // нечетен етаж
                for (int currentApartment = 0; currentApartment <= rooms - 1; currentApartment++) {
                    if (currentApartment == rooms - 1) {                   // ако стаята е последна минаваме на нов ред
                        System.out.printf("A%d%d%n", currentFloor, currentApartment);           // обхождаме апартаменти
                    } else {
                        System.out.printf("A%d%d ", currentFloor, currentApartment);
                    }
                }
            }
        }
    }
}
