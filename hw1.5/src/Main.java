import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = {{1, 3, 5, 7},

                {5, 2, 3, 8},

                {12, 0, -3, 1}};

        int count = 0;
        for (int i = 0; i < 3; i++) {
            count+=IntArraySort.BoobleSort(a[i], (i + 1) % 2);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(count);

    }
}
