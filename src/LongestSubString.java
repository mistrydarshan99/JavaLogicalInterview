import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubString {
    static void longestSubstring(String inputString) {
        //Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        //Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        //Creating LinkedHashMap with characters as keys and their position as values.

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        //Iterating through charArray

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            //If ch is not present in charPosMap, adding ch into charPosMap along with its position

            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }

            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap

            else {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength

            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();

                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void main(String[] args) {
        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");

        longestSubstring("thelongestsubstring");

        longestCommonSubstrings("abcdaf", "gbcdf");
    }

    public static Set<String> longestCommonSubstrings(String s, String t) {
        int[][] table = new int[s.length()][t.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1
                        : 1 + table[i - 1][j - 1];
                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(s.substring(i - longest + 1, i + 1));
                }
            }
        }
        return result;
    }
}
