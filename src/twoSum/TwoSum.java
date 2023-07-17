package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 5, 0, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] indexs = new int[2];
        //первый параметр значение, второй - индекс
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(target-nums[i])) {
                indexs[1] = i;
                indexs[0] = maps.get(target - nums[i]);
            }
            maps.put(nums[i],i);
        }
        return indexs;
    }


}
