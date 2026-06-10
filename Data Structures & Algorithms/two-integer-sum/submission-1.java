class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] out = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                out[0]=(i<j)?i:j;
                out[1]=(j>i)?j:i;
              }
            }
        }
       return out; 
    }
}
