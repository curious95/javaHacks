package javaHacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {

	public static void main(String args[]) {

		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6)));

	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			int indx = IntStream.range(0, nums.length).filter(a -> complement == nums[a]).findFirst().orElse(-1);

			if (indx != -1 && indx!=i) {
				return new int[] { i, indx };
			}

		}

		return null;

	}

}
