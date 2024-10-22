package T3158;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int []nums=new int[k];
        for(int i=0;i<k;i++){
            nums[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int res=sol.duplicateNumbersXOR(nums);
        System.out.println(res);
    }
}
