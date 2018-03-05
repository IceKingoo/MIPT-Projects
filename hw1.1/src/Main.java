public class Main {
    public static void main(String[] args) {
        int a[] = {2, 6, 7, 12};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] % 3 == 0) System.out.print(a[i] + " ");
        }
    }
}

