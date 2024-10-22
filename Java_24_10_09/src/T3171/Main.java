package T3171;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        Solution5 sol=new Solution5();
        int res=sol.minimumDifference(arr, k);
        System.out.println(res);
    }
}
