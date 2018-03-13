public class Main {
    public static void main(String[] args) {
        int a[] = new int[7];
        Operation perform = new Operation();
        a = perform.randomEvenFulfill(a);
        a = perform.operation(a);
        perform.print(a);
    }

}
