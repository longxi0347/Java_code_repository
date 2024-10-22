package T3171;
//超出时间限制
//808 / 813 个通过的测试用例
public class Solution4 {
    public int minimumDifference(int[] nums, int k) {
        int res=Math.abs(nums[0]-k);
        int count=0;
        int len=nums.length;
        int b=0;
        for(int i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=0;
                b++;
            }
        }
        int c=len-b;
        int []arr2=new int[c];
        b=0;
        for(int i=0;i<len;i++){
            if (nums[i]!=0) {
                arr2[b] = nums[i];
                b++;
            }
        }
        for (int i = 0; i < c; i++) {
            count = arr2[i];
            for (int j = i; j < c; j++) {
                count=count|arr2[j];
                if (Math.abs(count - k) < res)
                    res = Math.abs(count - k);
            }
        }
        return res;
    }
}
