import java.util.Scanner;

public class PAT1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double e = sc.nextDouble();
        int D = sc.nextInt(),K,kz=0,kn=0;
        for (int i = 0; i < n; i++) {
            int temp = 0,t=0;
            K = sc.nextInt();
            String s = sc.nextLine();
            String[] EE = s.split(" ");
            for (int i1 = 0; i1 < EE.length; i1++) {
                if(EE[i1].length()>0) {
                    Double E = Double.parseDouble(EE[i1]);
                    if (E < e) temp++;
                    if (temp > K / 2) {
                        t = 1;
                        break;
                    }
                }
            }
            if(K>D&&t==1) {
                kz++;t=2;
            }
            if(t==1) {
                kn++;
            }
        }
        System.out.printf("%.1f",kn*1.0/n*100);
        System.out.print("% ");
        System.out.printf("%.1f",kz*1.0/n*100);
        System.out.println("%");
    }
}
