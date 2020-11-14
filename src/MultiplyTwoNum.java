public class MultiplyTwoNum {

    public static void main(String[] args) {
        System.out.println(multiply(4, 5));
        System.out.println(multiply(40, 15));
    }

    public static int multiply(int num1, int num2){

        int result = 0;

        for (int i = 0; i < num2; i++) {
            result += num1;
        }

        return result;
    }
}
