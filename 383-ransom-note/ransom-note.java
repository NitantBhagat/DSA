class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(char m : ransomNote.toCharArray()){
            if(!map.containsKey(m) || map.get(m) == 0){
                return false;
            }
            map.put(m,map.get(m)-1);
        }

        return true;
    }
}