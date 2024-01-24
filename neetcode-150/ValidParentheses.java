class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c: s.toCharArray()) {
            switch(c) {
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;   
                default:
                    stack.push(c);    
            }
        }

        if (!stack.empty()) {
            return false;
        } else {
            return true;
        }

    }
}
