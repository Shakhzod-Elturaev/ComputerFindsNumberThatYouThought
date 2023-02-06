import java.util.Scanner;

public class FindNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        for (int i = 0; i < 4; i++) {
            int middle = (min + max) / 2;
            System.out.println("Is your number greater than " + middle + " (y/n): ");
            String response = scanner.nextLine();

            switch (response) {
                case "y" -> {
                    min = middle + 1;
                }
                case "n" -> {
                    max = middle;
                }
            }
        }
    }
}
