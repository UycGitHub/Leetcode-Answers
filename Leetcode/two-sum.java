class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];
        for(int i=0; i<nums.length-1; i++ ){
            for(int k=i+1; k<nums.length; k++){
                if(nums[i] + nums[k] == target){
                    outputArray[0] = i;
                    outputArray[1] = k;
                    break;
                }
            }
        }
        return outputArray;
    }
}

//link --> https://leetcode.com/problems/two-sum/submissions/
