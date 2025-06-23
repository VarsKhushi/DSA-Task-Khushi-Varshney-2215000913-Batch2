class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
            b=b^i+1;
        }
        return a^b;
    }
}