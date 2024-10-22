package T3171;
//超出时间限制
//802 / 813 个通过的测试用例
public class Solution1 {
    public int minimumDifference(int[] nums, int k) {
        int res=Math.abs(nums[0]-k);
        int count=0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int a = i;
                count = nums[i];
                while (a != j) {
                    count = count | nums[a + 1];
                    a++;
                }
                if (Math.abs(count - k) < res)
                    res = Math.abs(count - k);
            }
        }
        return res;
    }
}

