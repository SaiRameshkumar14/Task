
import java.util.*;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements. Note that you must do this in-place without making a copy of the array.
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:
// Input: nums = [0]
// Output: [0]
// Constraints:
// 1 <= nums.length <= 10^4
// -2^31 <= nums[i] <= 2^31 - 1
// Follow up: Could you minimize the total number of operations done?
// https://leetcode.com/problems/move-zeroes/description/
// *************************************************************************
public class MoveZero {

    static int[] movingZero(int[] nums) {
        int nonZeroPointer = 0;
        int everyElementPointer = 0;

        while (everyElementPointer < nums.length) {
            if (nums[everyElementPointer] != 0) {
                int temp = nums[everyElementPointer];
                nums[everyElementPointer] = nums[nonZeroPointer];
                nums[nonZeroPointer] = temp;

                nonZeroPointer++;
            }
            everyElementPointer++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(movingZero(nums)));
    }
}
