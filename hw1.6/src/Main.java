import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String test = in.nextLine();//считывание строки
        StringChecker checker = new StringChecker();
        checker.isPolindrome(test);
    }
}
