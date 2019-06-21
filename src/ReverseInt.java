public class ReverseInt {

    public static void main(String[] args) {

        System.out.println("Using reverInt");
        System.out.println(reverInt(-123));
        System.out.println(reverInt(123));
        System.out.println(reverInt(120));

        System.out.println("Using reverIntTrick_2");
        System.out.println(reverIntTrick_2(123));
        System.out.println(reverIntTrick_2(120));
        System.out.println(reverIntTrick_2(-123));
    }

    private static int reverInt(int x) {

        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    private static long reverIntTrick_2(int x) {
        boolean isNegativeNum = false;
        if (x < 0) {
            x = Math.abs(x);
            isNegativeNum = true;
        }

        long res = 0;
        StringBuilder stringBuilder = new StringBuilder();
        if (isNegativeNum){
            stringBuilder.append("-");
        }

        for (; x != 0; x /= 10) {
            int moduloNumber = x % 10;
            stringBuilder.append(moduloNumber);
        }
        res = Long.parseLong(stringBuilder.toString());
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
