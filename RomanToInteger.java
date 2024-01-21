class Solution {
    public int romanToInt(String s) {
        /**
        sum = 0

        For each char in s:
        switch:
        - char is I:
            - if next char is V:
                - add 4
            - if next char is X
                - add 10
            - else 
                - add 1    
        - char is V: add 5
        - char is X: add 10
            - if next char is L:
                - add 40
            - if next char is C
                - add 90
            - else 
                - add 100  
        - ...
        - char is C: add 100
            - if next char is D:
                - add 400
            - if next char is M
                - add 900    
         */
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
         
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 
'X') {
                            sum -= 1;
                              break;
                        }
                    }
                    sum += 1;
                    break;    
                case 'V': 
                    sum += 5;
                    break;        
                case 'X': 
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'L' || s.charAt(i + 1)== 
'C') {
                            sum -= 10;
                              break;
                        }
                    }
                    sum += 10;
                    break;    
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i < s.length() - 1) {
                        if ((s.charAt(i + 1) == 'D') ||  (s.charAt(i + 1) 
== 'M')) {
                            sum -= 100;
                            break;
                        }
                    }
                    sum += 100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+= 1000;        
                default:
                    break;
            }
        }
        return sum;
    }
}
