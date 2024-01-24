class Solution {
    static int nums[];
    static int target;

    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        return find(0, nums.length - 1);     
    }

    private static int find(int start, int end) {

        if (start > end) {
            return -1;
        }

        int middle = (int) (start + end) / 2;

        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return find(start, middle - 1);
        } else {
            return find(middle + 1, end);
        }
    }
}
