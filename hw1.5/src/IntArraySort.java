public class IntArraySort {

    public int BoobleSort(int a[], int indicator) {
        //если индикатор равен 1, то сортировка по возрастанию, если ноль, то по убыванию
        int count = 0;//число итераций
        boolean y = true;
        if (indicator == 1) y = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                boolean x = a[j] > a[j - 1];
                if (!x && y || x && !y) {
                    int c = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = c;
                    count++;
                }
            }
        }
        return count;

    }

    public int oddSort(int a[][]) {
        int count = 0;
        IntArraySort sort = new IntArraySort();

        for (int i = 0; i < 3; i++) {
            count += sort.BoobleSort(a[i], (i + 1) % 2);
        }
        return count;
    }
}
