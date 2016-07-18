import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Created by dgq on 16/6/10.
 */
public class TwoSum {
	/**
	 * Time complexity: O(n2)
	 * Space complexity: O(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++){
			for (int j = i + 1; j < nums.length; j++){
				if (nums[i] + nums[j] == target){
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public int[] twoSum2(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if (map.containsKey(complement)){
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int target = 10;
		int[] result = new TwoSum().twoSum(nums, target);
		for (int item : result){
			System.out.println(item);
		}
	}
}
