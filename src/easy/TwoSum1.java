package easy;

/*import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;*/

public class TwoSum1 {
	public int[] twoSum(int[] arr, int target){
//		List<Integer> indices;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					return new int[]{i,j};
//					indices=new ArrayList<Integer>(Arrays.asList(i,j));
//					return indices;
				}
			}
		}
		return new int[]{-1,-1};
//		indices=new ArrayList<Integer>(Arrays.asList(-1,-1));
//		return indices;
	}
	public static void main(String[] args) {
		System.out.println(new TwoSum1().twoSum(new int[] {2,7,8,9},9));
	}
}
