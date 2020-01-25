public class ReverseString {

    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("MyJava");

        System.out.println(sbf.reverse());    //

        StringBuilder stringBuilder = new StringBuilder("Darshan");

        System.out.println(stringBuilder.reverse());    //

//        stringReverse("Hello");

        System.out.println(recursionReverse("Demo"));
    }

    private static void stringReverse(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }

    private static String recursionReverse(String str){
        if (str.isEmpty()){
            return str;
        }

        return recursionReverse(str.substring(1)) + str.charAt(0);
    }
}
