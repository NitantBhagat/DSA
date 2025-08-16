class Solution {
    public int maximum69Number (int num) {
        int idx = -1;
        int n = num ;
        int pos=0;

        while(n>0){
            int d = n%10;
            if(d == 6) idx = pos;
            pos++;
            n/=10;
        }

        if(pos == -1) return num;
        else return (int)(num + 3 * Math.pow(10,idx));
    }
}