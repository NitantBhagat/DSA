class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> queue = new ArrayDeque<>();

        for(char c :s.toCharArray()){
            if(queue.isEmpty()){
                queue.offerLast(c);
            }else if( queue.peekLast() != c){
                queue.offerLast(c);
            }else{
                queue.pollLast();
            }
        }

        StringBuilder sb = new StringBuilder();
        
        while(!queue.isEmpty()){
            sb.append(queue.pollFirst());
        }

        String res = sb.toString();
        return res;
}
}