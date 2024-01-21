class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        for each number n:
        - if the difference n and target is greater than n
            - keep iterating upwards, till difference is found or curr is 
past difference
        - else:
            - keep iterating downards, till difference is found or curr is 
past difference

            O(n^2) time, O(1) space     
        */

        /*
        Better solution:

        Have two pointers: one at the start, one at the end
        while the two pointers are not past each other
        - if the sum of the two pointers' values is less than the target, 
increment the start pointer.
        - if the sum is greater than the target, decrement the end pointer
        - if they're equal, return the pair

        Time: O(n), where n = length of array. This is when the solution 
is exactly in the middle
        Space: O(1)
        */

        int start = 0, end = numbers.length - 1;
        int sum = numbers[start] + numbers[end];
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start+1, end+1};
            }
        }
        return new int[0]; // should never happen, unless tehre is no 
solution
    }
}
