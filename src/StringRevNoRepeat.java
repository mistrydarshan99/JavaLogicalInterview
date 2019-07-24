import java.util.HashMap;

public class StringRevNoRepeat {

    public static void main(String[] args) {
        System.out.println(seconTrickRev("abbac")); //output: caba
        System.out.println(seconTrickRev("abbbaa")); //output: aba
    }

    private static String stringRev(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i > 0 && i < chars.length - 1 && chars[i] != chars[i + 1]) {
                stringBuilder.append(chars[i]);
            } else if (i == chars.length - 1 || i == 0) {
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println(stringBuilder.toString());
        return "";
    }

    private static String seconTrickRev(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char nextChar = '\0';
        for (int i = chars.length - 1; i >= 0; i--) {
            if (nextChar != chars[i]) {
                nextChar = chars[i];
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
