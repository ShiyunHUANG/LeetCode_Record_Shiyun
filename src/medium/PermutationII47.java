package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII47 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), new ArrayList<Integer>());
        return res;
    }
    private void dfs(int[] nums, int idx, List<Integer> path, List<Integer> idxList) {
        if (path.size() == nums.length) {
            res.add(path);
            return;
        }
        for (int curr = 0; curr < nums.length ; curr++) {
            if (idxList.contains(curr)) continue;
            
            //not to start with 2 same number
            
            if (curr > 0 && path.size() == 0) {
                while (nums[curr] == nums[curr - 1]) {//this is wrong
                    curr++; 
                }                
            }

            
            List<Integer> another = new ArrayList<Integer>(path);
            List<Integer> anotherIdxList = new ArrayList<Integer>(idxList);
            
            another.add(nums[curr]);
            anotherIdxList.add(curr);
            //idx + 1? nextIdx?
            dfs(nums, idx + 1, another, anotherIdxList);
        }
    }
}
