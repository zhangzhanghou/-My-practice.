import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class likou2373 {
    public int[][] largestLocal(int[][] grid) {
        int [][] re= new int[grid.length-2][grid.length-2];
        for (int i = 2; i < grid.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    list.add(grid[i-3+j][k]);
                }
            }
            for (int i1 = 2; i1 < grid.length; i1++) {
                re[i-2][i1-2] = Collections.max(list);
                if(i1!=grid.length-1){
                    list.remove(0);
                    list.remove(3);
                    list.remove(6);
                    list.add(grid[i-2][i1+1]);
                    list.add(grid[i-1][i1+1]);
                    list.add(grid[i][i1+1]);
                }
            }
        }

        return re;

    }
    public static void main(String[] args) {

    }
}
