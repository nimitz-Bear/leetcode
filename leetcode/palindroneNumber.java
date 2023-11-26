class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0) {
            String input = String.valueOf(x);

            String reverse = new StringBuilder(input).reverse().toString();

            if(reverse.equals(input)) {
                return true;
            } else {
                return false;
            }

        } else {
            // negative numbers can never be palindromes
            return false;
        }
    }
}

