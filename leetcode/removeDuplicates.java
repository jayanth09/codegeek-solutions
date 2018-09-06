/*
    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    Example 1:

    Given nums = [1,1,2],

    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

    It doesn't matter what you leave beyond the returned length.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        boolean dupFlag;
        int dupNumberCount = 0;
        int i = 1;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                // duplicate number found [1,1,2,2,3]
                i++;
            } else {
                // current jth index has different value i =0, j=2
                j++;
			    nums[j] = nums[i];
			    i++;
            }
        }
        return j+1;
    }
}