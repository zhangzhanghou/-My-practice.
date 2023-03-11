import java.util.Scanner;

public class 二进制数转字符串 {

    public static String printBin(double num) {
        double Bins[] = {0.5,0.25,0.125,0.0625,0.03125,0.015625,0.0078125,0.00390625};
        String s = "0.";
        for (int i = 0; i < Bins.length; i++) {
            if(num>=Bins[i]){
                s += "1";num -= Bins[i];
            }else s += "0";
            if(num==0) break;
            System.out.println(num);
        }
        if(num!=0) return "ERROR";
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(printBin(num));
    }
}
