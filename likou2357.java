import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 遍历数组，循环去减
 */
public class likou2357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
//        int step = 0;
//        int min=120;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(num>0){
                set.add(num);
            }
        }
        System.out.println(set.size());
//        while(min!=101){
//            min=101;
//            for (int i = 0; i < n; i++) {
//                if(nums[i]!=0&&min>nums[i]) min = nums[i];
//            }
//            for (int i = 0; i < n; i++) {
//                nums[i] -= min;
//                if(nums[i]<0) nums[i]=0;
//            }
//            step++;
//        }
//        System.out.println(step-1);
    }
}

/**
 * 优秀思路
 * 因为每次减去一个最下的非零整数，即数组每次都只能将一个非零的值转为零
 * 计算有多少个不同的非零值即可得出最小操作数
 * class Solution {
 *     public int minimumOperations(int[] nums) {
 *         Set<Integer> set = new HashSet<Integer>();
 *         for (int num : nums) {
 *             if (num > 0) {
 *                 set.add(num);
 *             }
 *         }
 *         return set.size();
 *     }
 * }
 *
 */



