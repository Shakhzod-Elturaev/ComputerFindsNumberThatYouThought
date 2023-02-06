import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int low = 1;
        int high = 1000;
        foundTarget(low, high);

    }
    public static void foundTarget(int low, int high){
        int result = 0;
        for(int i = 0; i < 10; i++){
            int middle = low + (high - low)/2;
            System.out.println("Is your number is greater than " + middle + "? Y/N");
            String a = scanner.nextLine();
            if(a.equalsIgnoreCase("y")){
                low = middle + 1;
            } else {
                high = middle;
            }
                result = middle;
        }
        int res = result;
        System.out.println("Is " + (++res) + " your number? Y/N");
        String a = scanner.nextLine();
        if(a.equalsIgnoreCase("y")){
            System.out.println("I found...Your number is " + (++result));
        }
        else System.out.println("I found...Your number is " + result);
    }
}