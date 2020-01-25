public class Fibonacci {

    public static void main(String[] args) {

        int n = 5, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        System.out.println("\n");
        printFibonacci(5);
    }

    static int n1 = 0, n2 = 1, sum = 0;
    static void printFibonacci(int count) {

        if (count > 0) {
            System.out.print(" " + n1);
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            printFibonacci(count - 1);
        }
    }
}
