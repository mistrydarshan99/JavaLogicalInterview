public class PalindromNumber {

    public static void main(String[] args) {
//        System.out.println("isPalindromNumbre " + isPalindromNumbre(-121));
        System.out.println("isPalindromNumbre " + isPalindromNumbre(13231));
    }

    private static boolean isPalindromNumbre(int x) {

        if (x < 0) return false;

        long res = 0;
        int originalX = x;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res == originalX;
    }

    private static boolean isPalindromeSecondTrick(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX / 10 == x;
    }
}
