class Solution {
    private static final char seperator = '&';

    public String encode(List<String> strs) {
        /*
        Create a string encoded = strs[0]
        For every string in strs:
        - append str.length + "&" + str
        */

        // handle empty case
        if (strs.size() == 0) {
            return "";
        }

        String encoded = "";

        for (int i = 0; i < strs.size(); i++) {
            encoded = encoded + strs.get(i).length() + seperator + 
strs.get(i);
        }

        return encoded;
    }

    public List<String> decode(String str) {
        /*
        Create empty list strs
        
        Iterate over encoded string:
        - find length (n), which is current index, until seperator, and 
convert it to int
        - increment until seperator is found
        - take n characters, and append that as a string to strs
        */

        List<String> strs = new ArrayList<String>();
        int i = 0;
        while (i < str.length()) {
            int numLength = 0;
            while (str.charAt(i+numLength) != seperator) numLength++;

            int length = Integer.parseInt(str.substring(i, i+numLength));
            i += numLength;

            strs.add(str.substring(i + 1, i+length + 1));

            i += length + 1;
        }
        return strs;
    }
}

