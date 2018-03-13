import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = {{1, 3, 5, 7},

                {5, 2, 3, 8},

                {12, 0, -3, 1}};

        IntArraySort sort = new IntArraySort();
        ArrayPrint print = new ArrayPrint();
        System.out.println("Изначальный массив");
        print.print(a);
        int count = sort.oddSort(a);
        System.out.println("Отсортированный массив");
        print.print(a);
        System.out.println("Число операций:"+count);

    }
}
