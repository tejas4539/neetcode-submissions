class Solution {
    public int evalRPN(String[] tokens) {
       Stack<String> stack = new Stack<>();
        for (String ch : tokens) {
            int n=ch.length()-1;
            if (Character.isDigit(ch.charAt(n))) {
                stack.add(ch);
            } else {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                //System.out.println(a+" "+b);
                if (ch.equals("+")) {
                    int sum=a+b;
                    stack.add(sum+"");
                } else if (ch.equals("-")) {
                    int min=a-b;
                    stack.add(min+"");
                } else if (ch.equals("*")) {
                    int mul=a*b;
                    stack.add(mul+"");
                } else if(ch.equals("/"))  {
                    int div=a/b;
                    stack.add(div+"");
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
