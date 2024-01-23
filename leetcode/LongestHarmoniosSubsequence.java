class Solution {
    public int findLHS(int[] nums) {
        /**
        First instinct:
        - sort
        - create a start, end pointer

        - for right pointer from 0 to n - 1
            -  add nums[right] to list

            - while max(list) - min(list) > 1
               - remove nlist(0) from list
               - increent left

            update max with list.size if needed


        Time: O(n log n) (sorting)
        Space: O(n)/O(1) (depending if sorting is inplace)

        But violates maintaining order
         */

        // Arrays.sort(nums);

        // List<Integer> window = new ArrayList<Integer>();
        
        // int left = 0, right = 0;
        // int max = 0;

        // for (right = 0; right < nums.length; right++) {
        //     window.add(nums[right]);

        //     while (nums[right] - nums[left] > 1) {
        //         window.remove(0);
        //         left++;
        //     }

        //     if (nums[right] - nums[left]== 1 && window.size() > max)
        //         max = window.size();
        // }

        // return max;

         /*
         Better plan:

         Create a HashMap of (value, frequency)

        for (value: nums) 
            if (value exists in map)
                - increment value's frequency
            else
                - put (value, 1) into map
        
        - create value max = 0
        For every key in the map
        - get the key's value: x
            - if key - 1 exists
                - add previous' value + x
                - check if sum needs to be upated

            - if key + 1 exists
                - add next's value + x
                - check if sum needs to be updated

        return max  

        Time: O(n) 
        Space: O(n) (worst case being every value in n is unique)           
         */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = 0;
        for (int key: map.keySet()) {
            int x = map.get(key);

            if (map.containsKey(key + 1) && 
            x + map.get(key + 1) > max) {
               max = x + map.get(key + 1);   
            }

             if (map.containsKey(key - 1) && 
             x + map.get(key - 1) > max) {
                max = x + map.get(key - 1);
                
            }
        }

        return max;

    }

    private static int min(List<Integer> nums) {
        int min = Integer.MAX_VALUE;

        if (nums.size() == 0)
            return 0;

        for (int num: nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

      private static int max(List<Integer> nums) {
        int max = Integer.MIN_VALUE;

        if (nums.size() == 0)
            return 0;

        for (int num: nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }



    
}
