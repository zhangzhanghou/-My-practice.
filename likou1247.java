import java.util.Scanner;

public class likou1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int x = 0, y = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x') x++;
            else y++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'x') x++;
            else y++;
        }
        if (y % 2 != 0 || x % 2 != 0) System.out.println("-1");


        System.out.println(x + " " + y);
    }

    public static void jiaohuan(String s1, String s2, int i, int j) {
        if (s1.compareTo(s2) == 0) {

        }
    }

    public int minimumSwap(String s1, String s2) {
        int x = 0, y = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x') x++;
            else y++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'x') x++;
            else y++;
        }
        if (x % 2 != 0 || y % 2 != 0) return -1;
        int count = 0;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] != b[j] && a[i] != b[j]) {
                        b[j] = a[i];
                        break;
                    }
                }
            }
        }
        return count;
    }
}
