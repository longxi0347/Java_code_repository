package T3171;
//超出时间限制
//806 / 813 个通过的测试用例
import java.util.LinkedList;
import java.util.Queue;

public class Solution5 {
    public int minimumDifference(int[] nums, int k) {
        int res=Math.abs(nums[0]-k);
        int count=0;
        int len=nums.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = len-1; i >= 0; i--) {
            count = nums[i];
            queue.offer(count);
            if (Math.abs(count - k) < res)
                res = Math.abs(count - k);
            for (int j = i+1; j < len; j++) {
                count=nums[i]|(queue.poll());
                queue.offer(count);
                if (Math.abs(count - k) < res)
                    res = Math.abs(count - k);
            }
        }
        return res;
    }
}
