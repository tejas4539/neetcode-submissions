class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c = s.charAt(0);
        if (c == '}' || c == ']' || c == ')')
            return false;

        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.add(ch);
            }else if(stack.isEmpty()){
                return false;
            } 
            else if (ch == ')' && stack.pop() != '(') {
                return false;
            } else if (ch == '}' && stack.pop() != '{') {
                return false;
            } else if (ch == ']' && stack.pop() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
