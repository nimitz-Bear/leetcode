class Solution {
    public int lengthOfLongestSubstring(String s) {
          /*
  use a hashset to store the list of unique chars
  create a left, right pointer (representing ends of window)

  while the right pointer is not at the end:
  - char c = s.charAt(right)
  - while c is in the set
      - remove s.charAt(left)
      - increment left
  - increment right
  - check if max needs to be updated to right - left
  - add c to set     
  */

    Set<Character> set = new HashSet<Character>();
    int right = 0, left = 0;
    int max = 0;

    for (right = 0; right < s.length(); right++) {
      char c = s.charAt(right);

      // remove characters from the start of the window, until the window 
is unique
      while (set.contains(c)) {
        set.remove(s.charAt(left));
        left++;
      }

      set.add(c);
      if (right - left + 1> max) {
        max = right - left + 1;
      }
    }

    return max;
    }
}
