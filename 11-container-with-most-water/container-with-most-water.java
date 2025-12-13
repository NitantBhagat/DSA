class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r= height.length -1 ;
        int maxW = 0;
        while(l<r){
            int w = r-l;
            int area = Math.min(height[l],height[r])*w;
            maxW = Math.max(area,maxW);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxW;
    }
}