package y;

import java.util.Scanner;

public class Main {

    private static Laptop laptop; // Perhatikan perubahan nama variabel untuk menghindari konflik dengan nama kelas Laptop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Pilih laptop:");
            System.out.println("a. Lenovo");
            System.out.println("b. Toshiba");
            System.out.println("c. MacBook");
            System.out.println("d. Exit");
            System.out.print("Pilih laptop: ");

            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "A":
                    laptop = new Lenovo();
                    break;
                case "B":
                    laptop = new Toshiba();
                    break;
                case "C":
                    laptop = new MacBook();
                    break;
                case "D":
                    System.out.println("Program selesai.");
                    continue;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            LaptopUser user = new LaptopUser(laptop);

            do {
                System.out.println("Menu:");
                System.out.println("1. ON - Menyalakan laptop");
                System.out.println("2. OFF - Mematikan laptop");
                System.out.println("3. UP - Menambah volume");
                System.out.println("4. DOWN - Mengurangi volume");
                System.out.println("5. BACK - Kembali ke pilih laptop");
                System.out.println("6. EXIT - Keluar");
                System.out.print("Pilih menu: ");

                input = scanner.nextLine().toUpperCase();

                switch (input) {
                    case "1":
                        user.turnOnLaptop();
                        break;
                    case "2":
                        user.turnOffLaptop();
                        break;
                    case "3":
                        user.makeLaptopLouder();
                        break;
                    case "4":
                        user.makeLaptopSilence();
                        break;
                    case "5":
                        break;
                    case "6":
                        System.out.println("Program selesai.");
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                        break;
                }

            } while (!input.equals("5") && !input.equals("6"));

        } while (!input.equals("D"));

        scanner.close();
    }
}
