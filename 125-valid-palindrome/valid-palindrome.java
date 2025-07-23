class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0,r=ns.length()-1;

        while(l<r){
            if(ns.charAt(l)!=ns.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}