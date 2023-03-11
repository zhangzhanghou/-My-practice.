import java.util.Scanner;

/**
 * 用搜索的方法，时间都会比较长
 * 有 位压缩的方法，看看！！
 */

public class likou1255 {
    static int max=0;
    public static void find(String[] words, int sum, int i, int[] letter, int[] score,String s) {
        if (i >= words.length) {
            if (sum > max) max = sum;
            System.out.println(sum);
        } else {
            int j, sco = 0;
            int[] letterr = new int[26];
            for (int k = 0; k < 26; k++) {
                letterr[k] = letter[k];
            }
            for (j = 0; j < words[i].length(); j++) {
                if (letterr[words[i].charAt(j) - 'a'] > 0) letterr[words[i].charAt(j) - 'a']--;
                else break;
            }
            if (j == words[i].length()) {
                for (j = 0; j < words[i].length(); j++) {
                    sco += score[words[i].charAt(j) - 'a'];
                }
                s = s + words[i];
                System.out.println("xuan" + s);
                find(words, sum + sco, i + 1, letterr, score, s);
            }
            find(words, sum, i + 1, letter, score, s);
            System.out.println("buxuan" + s);
        }
    }
    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        max = 0;
        int[] letter= new int[26];
        for (int i = 0; i < letters.length; i++) {
            int t = letters[i]-'a';
            letter[t] ++;
        }
        find(words,0,0,letter,score,"");
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words  = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        char[] letters  = sc.next().toCharArray();
        int[] score = new int[26];
        for (int i = 0; i < 26; i++) {
            score[i] = sc.nextInt();
         }
        System.out.println(maxScoreWords(words,letters,score));
    }
}
