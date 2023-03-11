import java.util.Scanner;

public class likou1144 {

    public static int movesToMakeZigzag(int[] nums) {
        int sum = 0,min = 0,t;
        for(int i=1;i<nums.length;i=i+2){
            t=1001;
            if(i-1>=0){
                t = nums[i-1];
            }
            if(i+1<nums.length){
                t = Math.min(t,nums[i+1]);
            }
            if(t!=1001 && nums[i]>=t)
                sum += nums[i] - t +1;
        }
        min = sum;
        sum=0;
        for(int i=0;i<nums.length;i=i+2){
            t=1001;
            if(i-1>=0){
                t = nums[i-1];
            }
            if(i+1<nums.length){
                t = Math.min(t,nums[i+1]);
            }
            if(t!=1001 && nums[i]>=t)
                sum += nums[i] - t +1;
        }
        if(sum<min) min = sum;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(movesToMakeZigzag(nums));
    }
}
