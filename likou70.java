/**
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */

import java.util.Scanner;

public class likou70 {
    static int sum=0;
    public static void pa(int i){
        if(i==0){
            sum++;
        }
        else{
            if(i>=2) pa(i-2);
            if(i>=1) pa(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pa(n);
        System.out.println(sum);
    }
}

/**
 * class Solution {
 *     public int climbStairs(int n) {
 *         if(n==0){
 *             return 1;
 *         }
 *         if(n<0) return 0;
 *         else return climbStairs(n-2)+climbStairs(n-1);
 *     }
 * }
 *
 * 21/45 问题：超出时间限制，不能用递归，空间换时间
 *
 *
 * class Solution {
 *     public int climbStairs(int n) {
 *         int Stairs[] = new int[46];
 *         Stairs[0] = 0;
 *         Stairs[1] = 1;
 *         Stairs[2] = 2;
 *         for(int i=3;i<=n;i++){
 *             Stairs[i] = Stairs[i-2]+Stairs[i-1];
 *         }
 *         return Stairs[n];
 *     }
 * }
 */

