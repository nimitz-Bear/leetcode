class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        // (target - number), number

        // for all the numbers
            // if the map has the difference between `n` and the target, 
return map entry, n
            // else, add n - target, n to the map

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (map.get(n) != null) {
                return new int[]{ (Integer)map.get(n), i};
            } else {
                map.put(target - n, i);
            }
        }
        return new int[]{-1};
    }
}
