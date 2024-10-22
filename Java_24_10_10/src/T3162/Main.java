package T3162;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1=sc.nextInt();
        int []nums1=new int[len1];
        for(int i=0;i<len1;i++){
            nums1[i]=sc.nextInt();
        }
        int len2=sc.nextInt();
        int []nums2=new int[len2];
        for(int i=0;i<len2;i++){
            nums2[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Solution sol=new Solution();
        System.out.println(sol.numberOfPairs(nums1, nums2, k));
    }
}
