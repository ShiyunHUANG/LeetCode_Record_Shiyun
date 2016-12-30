package medium;

import java.util.Arrays;

public class ThreeSumCloset16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < len; i++) {
            int p1 = i + 1, p2 = len - 1;
            while(p1 < p2) {
                int temp = nums[i] + nums[p1] + nums[p2];
                if(Math.abs(target - temp) < Math.abs(target - sum)) sum = temp;
                if(temp < target) p1++;
                else p2--;
            }
        }
        return sum;
    }
}
