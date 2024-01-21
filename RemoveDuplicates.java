class Solution {
    public int removeDuplicates(int[] nums) {
        // Bad SOlution:

        /*
        initalize start (1), end (last index)

        while the two pointrs arent past each other
        - if nums[start] == nums[start - 1]
            - store nums[start] in a temp variable
            - shift down all numbers from start to end, inclusive
             - swap nums[start], nums[end]
            - decrement end
        - increment start

        - end: start of part to be ignored
        - start: start of part yet to be checked

        O(n^2)
         */

        // int start = 1, end = nums.length - 1;

        // while (start < end) {
        //     if (nums[start] == nums[start - 1]) {
        //         int temp = nums[start];
                
        //         // shift all previous elements down
        //         for (int i = start + 1; i <= end; i++) {
        //             nums[i - 1] = nums[i];
        //         }
        //         nums[end] = temp;
        //         end--;
        //     } else {
                
        //         start++;
        //     }

        // }
        // System.out.println(start);
        //    System.out.println(end);

        // if (nums.length > 1 && nums[start] == nums[start - 1]) {
        //     return start;
        // } else {
        // return start + 1;
        // }

        // Improved solution:
        /**
        initalize left, right pointers at index 1

        - if nums[right] is the same as nums[right - 1]:
            - increment right
        - else: 
         - nums[left] = nums[right]
         - incremnt let
             
        return left     

        Time: O(n^2)
        Space: O(1)
         */

        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == nums[right - 1]) {
                continue;
            } else {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
