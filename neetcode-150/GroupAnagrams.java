class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<String, 
List<String>>();

        // sort each of the strings
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            // if sorted string is in hashmap, append s to map
            // else, put a new value, with sorted, [s] as a singleton
            if (anagrams.containsKey(sorted)) {
                List<String> values = anagrams.get(sorted);
                values.add(s);
                anagrams.put(sorted, values);
            } else {
                List<String> values = new LinkedList<String>();
                values.add(s);
                anagrams.put(sorted, values);
            }      
        }

        // after putting all anagrams in a hasmap, move them all into a 
list
        List<List<String>> result = new ArrayList<List<String>>();
        for (String key: anagrams.keySet()) {
            result.add(anagrams.get(key));
        }
        return result;
    }
}
