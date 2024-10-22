package T3171;
//超出时间限制
//807 / 813 个通过的测试用例
public class Solution2 {
    public int minimumDifference(int[] nums, int k) {
        int res=Math.abs(nums[0]-k);
        int count=0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            count = nums[i];
            for (int j = i; j < len; j++) {
                count=count|nums[j];
                if (Math.abs(count - k) < res)
                    res = Math.abs(count - k);
            }
        }
        return res;
    }
}
