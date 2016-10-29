package easy;

public class ProductOfArrayExceptSelf238 {
    //over time limit
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int ele;        
        for (int i = 0 ; i < nums.length; i++) {
            ele = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                ele = ele * nums[j];
            }            
            res[i] = ele;
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
