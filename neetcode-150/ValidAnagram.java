class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap map_s = new HashMap<Character, Integer>();
        HashMap map_t = new HashMap<Character, Integer>();
        // create a hashmap for s (letter, count)
        // create a hashmap for t (letter, count)
        map_s = createMap(s);
        map_t = createMap(t);
        // iterate over both hasmaps
        // and ensure that all letters appear exactly the same amount of 
times
        return map_s.equals(map_t);
    }

    // for each letter:
    // if the letter is new, put it in, else increment
    private HashMap<Character, Integer> createMap(String s) {
        HashMap map = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int count = (Integer) map.get(c) + 1;
                map.put(c, count);
            }
        }

        return map;
    }
