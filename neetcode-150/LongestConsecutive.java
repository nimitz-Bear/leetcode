class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        Create a set from nums
    
        for each value in set:
        - create a list, called sequence
        - if value - 1 not in set:
            - create new list in sequences, starting with value
            - while (value++) is in set:
                - append value to sequence
            - if sequence is longer than current longest
                - longest = sequence.length

           return longest
         */
        Set<Integer> set = new HashSet<Integer>();
        int longest = 0;

        // populate set
        for (int num: nums) {
            set.add(num);
        }

        for (int value: set) {
            // check fi value si start of sequence
            if (!set.contains(value - 1)) {
                List<Integer> sequence = new ArrayList<Integer>();

                int current = value;
                while(set.contains(current)) {
                    sequence.add(current);
                    current++;
                }

                if (sequence.size() > longest) {
                    longest = sequence.size();
                }
            }
        }

        return longest;
    }
}
