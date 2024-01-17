class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /* 
        Create a hashmap of <value, count>
        Create an array indexed by freuqnecy, with a list as a value

        Go through all the values in nums:
        - if value exists in map, increment count and update frequency
        - else, put value in map, with count of 1 and update frequency

        Afterwards; populate frequency, by going through each entry in the 
hashmap:
        - get list of values associated with a frequency
        - append entry to list

        Create an array of results
        - Iterate through the frequency in reverse, until k results are 
found
        
        O(m + n), where m = number of unique values, n = length of nums
         */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<ArrayList<Integer>> frequency = new 
ArrayList<ArrayList<Integer>>();

        // populate frquency with empty list
        for (int i = 0; i <= nums.length ;i++ ) {
            frequency.add(new ArrayList<Integer>());
        }

        for (int n: nums) {
            if (map.containsKey(n)) {
                int count = map.get(n) +1;
                map.put(n, count);
            } else {
                map.put(n, 1);
            }
        } 


        for (int key: map.keySet()) {
            ArrayList<Integer> list = frequency.get(map.get(key));
            list.add(key);
            frequency.set(map.get(key), list);
        }

        int[] results = new int[k];
        int resultsFound = 0;
        int i = frequency.size() - 1;
        // keep adding values to results, until resultsFound is k
        while (i >= 0) {
            for (int num: frequency.get(i)) {
                results[resultsFound] = num;
                resultsFound++;

                if (resultsFound == k) {
                    return results;
                }
            }
            
            i--;
        }


        return new int[0];
    }
}
