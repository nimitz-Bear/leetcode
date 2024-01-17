class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        Create an array of answers, size of nums.length

        for each index, calculate product of previous elements

        for each index, calculate product of following elements

        for each index, calculate product of prev elements * following 
elements

        Time: O(3*n) = O(n), where n = nums.length
        Space: O(3*n) = O(n)

        Note: could probably make space O(1)
        */
        int[] answers = new int[nums.length];
        int[] prev = new int[nums.length];
        int[] next = new int[nums.length];

        int previous = 1;
        for (int i = 0; i < nums.length; i++) {
            prev[i] = previous;
            previous *= nums[i];
            // System.out.println(prev[i]);
        }

        int following = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            next[i] = following;
            following *= nums[i];
            // System.out.println(next[i]);
        }

          
        for (int i = 0; i < nums.length; i++) {
            answers[i] =  prev[i] * next[i];
        }

        return answers;
    }
}
