import java.util.Scanner;

class NumberOperations {
    //Рекурсивно вычисляет сумму цифр числа x.
    private static int RecursuveDigitSum(int x) {

        if (x % 10 == 0) return 0;
        return RecursuveDigitSum(x / 10) + x % 10;

    }

    static public int DigitSum(int value) {
        return RecursuveDigitSum(value);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(NumberOperations.DigitSum(in.nextInt()));
    }
}
