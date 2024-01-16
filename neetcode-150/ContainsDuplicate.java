class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap map = new HashMap<Integer, Integer>();
        
        for (int n: nums) {

            // put in a 
            if (map.get(n) == null) {
                map.put(n, 0);
            } else {
                return true;
            }
        }

        return false;
    }
}
