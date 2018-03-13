public class NumberOperations {
    //Рекурсивно вычисляет сумму цифр числа x.
    private static int recursuveDigitSum(int x) {

        if (x % 10 == 0) return 0;
        return recursuveDigitSum(x / 10) + x % 10;

    }

     public int digitSum(int value) {
        return recursuveDigitSum(value);
    }
}