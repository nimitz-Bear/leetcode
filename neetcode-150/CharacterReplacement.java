class Solution {
    public int characterReplacement(String s, int k) {
        /**
        Honestly nearly wholly copied from neetcode

        - create a hashmap to store the frequency in character, count
        - create a left and right pointer

        increment right from 0 to s.length - 1
         - c = s[right]
        - add or increment c's value

       // (r - l + 1) - max(freq.values()) represents the number of chars 
to replace

        - while ((r - l + 1) - max(freq.values) > k)
            - decrement or remove s.charAt(left)'s value
            - increment left (sliding window forward)

        - if (right - left + 1) > max
            - update max

        return max        
        
        Type: sliding window

        Time: O(n)
        Space: O(26)≅ O(1)
         */
        int left = 0, right = 0;
        HashMap<Character, Integer> freq = new HashMap<Character, 
Integer>();
        int res = 0;

        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }   

    
            while ((right - left + 1) - max(freq) > k) {
                // System.out.println(s.charAt(left));
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
          
                if (freq.get(s.charAt(left)) == 0)
                    freq.remove(s.charAt(left));
               left++;    
    
            }

            if (right - left + 1 > res)
                res = right - left + 1;
        }

        return res;
    }

    private int max(HashMap<Character, Integer> map) {
        if (map.size() == 0)
            return 0;

        return Collections.max(map.values());
    }
}
