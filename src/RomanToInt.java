import java.util.HashMap;

public class RomanToInt {

    private static HashMap<Character, Integer> romanKey;

    public static void main(String[] args) {

        romanKey = new HashMap<Character, Integer>();
        romanKey.put('I', 1);
        romanKey.put('V', 5);
        romanKey.put('X', 10);
        romanKey.put('L', 50);
        romanKey.put('C', 100);
        romanKey.put('D', 500);
        romanKey.put('M', 1000);

//        romanToIntSum("IV");
//        romanToIntSum("XIV");
//        romanToIntSum("LXIV");
        romanToIntSum("XCIV");
    }

    private static int romanToIntSum(String romanNumber) {
        char[] chars = romanNumber.toCharArray();
        int length = chars.length;
        int sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            char aChar = chars[i];
            if (aChar == 'V' || aChar == 'X') {
                if (i - 1 >= 0) {
                    char previousChar = chars[i - 1];
                    if (previousChar == 'I') {
                        sum += (romanKey.get(aChar) - romanKey.get(previousChar));
                        i -= 1;
                    } else {
                        sum += romanKey.get(aChar);
                    }
                } else{
                    sum += romanKey.get(aChar);
                }
            } else {
                sum = sum + romanKey.get(aChar);
            }
        }
        System.out.println("Sum is " + sum);
        return 0;
    }
}
