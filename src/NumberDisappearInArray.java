import java.util.ArrayList;
import java.util.List;

public class NumberDisappearInArray {

    public static void main(String[] args) {

        List<Integer> listMissingAry = new ArrayList<>();
        int []numbers = new int[]{4,3,2,7,8,2,3,1};

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = Math.abs(numbers[i]);
            if (numbers[currentElement-1] > 0) {
                numbers[currentElement-1] = -numbers[currentElement-1];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                listMissingAry.add(i+1);
            }
        }

        System.out.println(listMissingAry);
    }

}
