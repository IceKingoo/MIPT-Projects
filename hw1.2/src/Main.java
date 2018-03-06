public class Main {
    public static void main(String[] args) {
        int a[] = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = i * 2;
        }
        for (int i = 1; i < 5; i += 2) {
            a[i] = a[i] * a[i - 1];
        }
    }

}
