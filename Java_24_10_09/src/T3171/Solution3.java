package T3171;
//超出内存限制
//805 / 813 个通过的测试用例
public class Solution3 {
    public int minimumDifference(int[] nums, int k) {
        int res=Math.abs(nums[0]-k);
        int count=0;
        int len=nums.length;
        int [][]arr=new int[len][len];
        for (int i = len-1; i >= 0; i--) {
            count = nums[i];
            arr[i][i]=count;
            if (Math.abs(count - k) < res)
                res = Math.abs(count - k);
            for (int j = i+1; j < len; j++) {
                count=nums[i]|arr[i+1][j];
                arr[i][j]=count;
                if (Math.abs(count - k) < res)
                    res = Math.abs(count - k);
            }
        }
        return res;
    }
}
