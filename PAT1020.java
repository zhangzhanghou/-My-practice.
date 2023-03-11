import java.util.Arrays;
import java.util.Scanner;

public class PAT1020 {

    public static void swap(double[] a, int i, int j) {
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void swap1(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] num = new int[n];
        int[] value = new int[n];
        double[] danjia = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
            danjia[i] = (double) value[i] / num[i];
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (danjia[j] < danjia[j + 1]) {
                    swap(danjia, j, j+1);
                    swap1(num, j, j+1);
                    swap1(value, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(danjia));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(value));

        for (int i = 0; i < n; i++) {
            if (d > num[i]) {
                sum += danjia[i] * num[i];
                d -= num[i];
            }else {
                sum += danjia[i] * d;
                break;
            }
            System.out.println("d"+d);
        }
        System.out.printf("%.2f",sum);
    }
}