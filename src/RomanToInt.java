import java.util.HashMap;
import java.util.Map;

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

        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XIV"));
        System.out.println(romanToInt("LXIV"));
        System.out.println(romanToInt("XCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int sum = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
