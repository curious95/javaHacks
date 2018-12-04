package javaHacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String args[]) {

		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6)));

	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> sum = new HashMap<>();

		for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {

			int complementI = target - nums[i];
			int complementJ = target - nums[j];

			if (sum.containsKey(complementI)) {
				return new int[] { sum.get(complementJ), i };
			}
			if (sum.containsKey(complementJ)) {
				return new int[] { sum.get(complementJ), j };
			}
			sum.put(nums[i], i);
			sum.put(nums[j], j);
		}

		return null;

	}

}
