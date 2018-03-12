import java.util.Scanner;

class IntArraySort {

    public static int BoobleSort(int a[], int indicator) {
        //если индикатор равен 1, то сортировка по возрастанию, если ноль, то по убыванию
        int count = 0;//число итераций
        if (indicator == 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = a.length - 1; j > i; j--) {
                    if (a[j] > a[j - 1]) {
                        int c = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = c;
                        count++;
                    }
                }
            }
            return count;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = a.length - 1; j > i; j--) {
                    if (a[j] < a[j - 1]) {
                        int c = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = c;
                        count++;
                    }
                }

            }
            return count;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = {{1, 3, 5, 7},

                {5, 2, 3, 8},

                {12, 0, -3, 1}};


        for (int i = 0; i < 3; i++) {
            IntArraySort.BoobleSort(a[i], (i + 1) % 2);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
