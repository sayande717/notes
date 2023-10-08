// 26. https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
         if(nums.length == 1)
            return 1;

        int addIndex = 1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]) {
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}