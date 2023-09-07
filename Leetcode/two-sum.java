//non - optimal solution
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

//challenge of the question --> follow up: Can you come up with an algorithm that is less than 0(n^2) time complexity?
//I don't know how to use hashmap well. So I can't solve the problem right now using hashmap. --> 07.09.2023
//I will add this solution when I find out.


//link --> https://leetcode.com/problems/two-sum/submissions/
