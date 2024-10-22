package T3152;

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int row=queries.length;
        int len=nums.length;
        boolean[] res=new boolean[row];
        for(int i=0;i<row;i++){
            for(int j=queries[i][0];j<queries[i][1];j++){
                if(queries[i][0]==queries[i][1]){
                    res[i]=true;
                    break;
                }
                if((nums[j+1]-nums[j])%2==0){
                    res[i]=false;
                    break;
                }
                if(j==queries[i][1])
                    res[i]=true;
            }
        }
        return res;
    }
}
