import java.util.Random;

public class Operation {
    public int[] randomEvenFulfill(int a[]) {
        int k = 0;
        int x;
        while (k < 7) {
            Random rand = new Random();
            x = rand.nextInt();
            if (x % 2 == 0) {
                a[k] = x;
                k++;
            }
        }
        return a;
    }

    public int[] operation(int a[]) {
        for (int i = 1; i < 5; i += 2) {
            a[i] = a[i] * a[i - 1];
        }
        return a;
    }
    public void print(int a[]){
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]+" ");
        }
    }

}
