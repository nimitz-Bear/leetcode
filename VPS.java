class Solution {
    public int maxDepth(String s) {
        int max_count = 0, depth = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                depth++;
            } else if (c == ')') {
                depth--;
            }

            if (depth > max_count) {
                max_count = depth;
            }
        }

        return max_count;
      
    }
}
