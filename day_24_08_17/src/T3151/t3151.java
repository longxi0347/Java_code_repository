package T3151;

//leetcode 3151. 特殊数组 I
//clear

class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++){
            if((nums[i]-nums[i-1])%2==0)
                return false;
        }
        return true;
    }
}

