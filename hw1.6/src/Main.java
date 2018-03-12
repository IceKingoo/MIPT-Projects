import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (StringChecker.isPolindrome(in.nextLine())) {
            System.out.println("Это полиндром");
        }else {
            System.out.println("Не полиндром");
        }
    }
}
