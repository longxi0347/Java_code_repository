package T3158;

public class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int [][]arr=new int[nums.length][2];
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(arr[j][0]==0){
                    arr[j][0]=nums[i];
                    arr[j][1]++;
                    break;
                }
                else if(arr[j][0]==nums[i]){
                    arr[j][1]++;
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i][0]==0){
                break;
            }
            if(arr[i][1]==2){
                res=res^arr[i][0];
            }
        }
        return res;
    }
}
