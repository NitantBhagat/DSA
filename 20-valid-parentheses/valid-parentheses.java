class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 !=0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            switch(c){
                case '{' : 
                    stack.push('}');
                    break;
                case '(' : 
                    stack.push(')');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                default :
                    if(!stack.isEmpty() && c == stack.peek()) stack.pop();
                    else return false;
            }   
        }

        return stack.isEmpty();
    }
}