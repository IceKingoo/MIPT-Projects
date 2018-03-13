import java.util.Scanner;
/*
*Дано натуральное число N. Вычислите сумму его цифр.
*При решении этой задачи нельзя использовать строки,
*списки, массивы (ну и циклы, разумеется)
* */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberOperations sum = new NumberOperations();
        System.out.println(sum.digitSum(in.nextInt()));
    }
}
