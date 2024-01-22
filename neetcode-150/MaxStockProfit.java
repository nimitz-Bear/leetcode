class Solution {
    public int maxProfit(int[] prices) {
        /**
        Two pointers: left and right

        while right pointer isn't past the end;
        - Left is updated, when the current index is less than the left 
index value.
        - if prices[right] - prices[left] > max, update max
        - RIght index is constnatly updated, and used to check for new 
profit margins

        return max

        Time: O(n)
        Space: O(1)
         */
        int left = 0, max = 0;
        for (int right = 0; right < prices.length; right++) {
            if (prices[right] - prices[left] > max) {
                max = prices[right] - prices[left];
            }

            if (prices[right] < prices[left]) {
                left = right;
            }
        }
        return max;
    }
}
