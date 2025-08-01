class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1, l=0 ;
        int r=n;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum == target){
                return new int[] {l+1,r+1};
            }else if(sum > target){
                r--;
            }else{
                l++;
            }
        }

        return new int[]{-1,-1};
    }
}