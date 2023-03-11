import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = 0;
        double sum = 0.0, x = 0.0;
        for (int i = 0; i < n; i++) {
            String ss = sc.next();
            try {
                x = Double.parseDouble(ss);
            } catch (Exception e) {
                System.out.print("ERROR: ");
                System.out.println(ss + " is not a legal number");
                continue;
            }
            String y = String.valueOf(x).split("\\.")[1];
            if (y.length() > 2) {
                System.out.print("ERROR: ");
                System.out.println(ss + " is not a legal number");
                continue;
            }
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