public class SecondSmallestElement {

    public static void main(String[] args) {
//        int result = secondSmallElement(new int []{7,9,8,5,2});
        int result = secondSmallElement(new int []{7,9});
        System.out.println(result);
    }

    static int secondSmallElement(int[] number){
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = 0;
        for (int j : number) {
            if (j < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = j;
            } else if (j < secondSmall) {
                secondSmall = j;
            }
        }

        return secondSmall;
    }
}
