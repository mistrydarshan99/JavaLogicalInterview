public class SlopeOfNumber {

    public static void main(String[] args) {
        String num = "1213321";
        int n = num.length();
        System.out.println("Slope = " +
                slopeOfNum(num, n));
    }

    // function to find
    // slope of a number
    static int slopeOfNum(String num, int n)
    {
        // to store slope of the
        // given number 'num'
        int slope = 0;

        // loop from the 2nd digit
        // up to the 2nd last digit
        // of the given number 'num'
        for (int i = 1; i < n - 1; i++)
        {

            // if the digit is a maxima
            if (num.charAt(i) > num.charAt(i - 1) &&
                    num.charAt(i) > num.charAt(i + 1))
                slope++;

                // if the digit is a minima
            else if (num.charAt(i) < num.charAt(i - 1) &&
                    num.charAt(i) < num.charAt(i + 1))
                slope++;
        }

        // required slope
        return slope;
    }
}
