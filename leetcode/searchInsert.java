/*
    Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You may assume no duplicates in the array.

    Example 1:

    Input: [1,3,5,6], 5
    Output: 2
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int finalIndex = -1;
        int i = 0;
        while ( i < nums.length) {
            if (nums[i] == target) {
                finalIndex = i;
                break;
            } else {
                i++;
            }
        }
        if (finalIndex >=0) {
            // finalIndex = ;
        } else {
            if (target < nums[0]) {
                finalIndex = 0;
            } else if (target > nums[nums.length - 1]) {
                finalIndex = nums.length;
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if ((target > nums[j]) && (target < nums[j+1])) {
                        finalIndex = j + 1;
                    }
                }   
            }
        }
        return finalIndex;
    }
}