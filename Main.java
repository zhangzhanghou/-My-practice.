import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = 0, k = 0;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            String ss = sc.next();
            k = 0;
            String[] s = ss.split("\\.");
            if (s.length > 2) {
                System.out.print("ERROR: ");
                System.out.println(ss + " is not a legal number");
                continue;
            }
            double x = 0;
            for (int i1 = 0; i1 < s[0].length(); i1++) {
                if (s[0].charAt(i1) != '-'){
                    int t = s[0].charAt(i1) - '0';
                    if (t <= 9 && t >= 0) {
                        x = x * 10 + t;
                    } else {
                        System.out.print("ERROR: ");
                        System.out.println(ss + " is not a legal number");
                        k = 1;
                        break;
                    }
                }
            }
            if (k == 1) continue;
            double y = 0, p = 0.1;
            k = 0;
            if (s.length > 1) {
                for (int i1 = 0; i1 < s[1].length(); i1++) {
                    int t = s[1].charAt(i1) - '0';
                    if (t <= 9 && t >= 0) {
                        y = y + t * p;
                        p = p * 0.1;
                    } else {
                        System.out.print("ERROR: ");
                        System.out.println(ss + " is not a legal number");
                        k = 1;
                        break;
                    }
                }
                if(s[1].length()<=2||y==0) {

                }else{
                    System.out.print("ERROR: ");
                    System.out.println(ss + " is not a legal number");
                    k=1;
                }
            }
            if (k == 1) continue;
            x = x + y;
            if (s[0].charAt(0) == '-') {
                x = -x;
            }System.out.println(x);
            if (x <= 1000 && x >= -1000) {
                sum += x;
                temp++;
            } else {
                System.out.print("ERROR: ");
                System.out.println(ss + " is not a legal number");
            }
        }
        if (temp == 0) {
            System.out.println("The average of 0 numbers is Undefined");
        } else if (temp == 1) {
            sum = sum / temp;
            System.out.print("The average of " + temp + " number is ");
            System.out.printf("%.2f", sum);
        } else {
            sum = sum / temp;
            System.out.print("The average of " + temp + " numbers is ");
            System.out.printf("%.2f", sum);
        }

    }
}