class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        Hashtable of (value, index), map

        GO through the entire array, from i until nums.length - 1
        - if the map.containsKey(value) AND abs(i - map.get(value)) <= k
         */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) 
<= k) {
                return true;
                
            } else {
                map.put(nums[i], i);
            }
        }

        return false;

    

    }
}
