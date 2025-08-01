class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 :1;
        x = Math.abs(x);
        int rev =0;
        while(x>0){
            int mod = x%10;

            if (rev > (Integer.MAX_VALUE - mod) / 10) return 0;
            
            rev = (rev * 10) +mod;
            x= x/10;
        }
        return sign * rev;
    }
}