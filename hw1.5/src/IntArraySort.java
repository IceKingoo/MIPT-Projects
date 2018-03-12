public class IntArraySort {

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
