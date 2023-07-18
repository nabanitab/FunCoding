package practices;

import java.util.HashMap;
import java.util.Map;

public class SumOfNumber {


    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 6};
        int target = 6;

        int[] result = indicesSumOfTwo(nums, target);

       /* System.out.println("Index values: " + result[0]
                + " and " + result[1]);*/
     //   System.out.println(nums[0]);
    }

    public static int[] indicesSumOfTwoNew(int[] nums, int target) {

        //int result = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

            for (int j = i + 1; j < nums.length; j++) {
                target= target+nums[i];

                /*if (nums[j] == nums[i]) {
                    target = nums[i];
                    nums[i] = nums[j];
                    nums[j] = target;
                }*/
            }
        }
        return nums;
    }

    public static int[] indicesSumOfTwo(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int sum = target - nums[i];

            if (map.containsKey(sum)) {

                return new int[]{map.get(sum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}



