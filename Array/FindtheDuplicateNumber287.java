//https://leetcode.com/problems/find-the-duplicate-number/description/
package Array;

import Utils.Utils;

public class FindtheDuplicateNumber287 {

	static Utils utils = new Utils();

	Utils util = new Utils();

	public static void main(String[] args) {

		FindtheDuplicateNumber287 cn = new FindtheDuplicateNumber287();

		utils.printLine(cn.findDuplicate(new int[] { 1, 3, 4, 1, 2 }));

	}

	public int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		int p1 = nums[0];
		int p2 = fast;

		while (p1 != p2) {
			p1 = nums[p1];
			p2 = nums[p2];
		}

		return p1;

	}
}
