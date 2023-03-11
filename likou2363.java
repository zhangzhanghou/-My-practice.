import java.lang.reflect.Array;
import java.util.*;

public class likou2363 {

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> sum = new ArrayList<>();
        Arrays.sort(items1,(a,b)->a[0]-b[0]);
        Arrays.sort(items2,(a,b)->a[0]-b[0]);
        int i=0,j=0;
        while(i<items1.length&&j<items2.length){
            if(items1[i][0]<items2[j][0]){
                sum.add(new ArrayList<>(Arrays.asList(items1[i][0],items1[i][1])));
                i++;
            }else if(items1[i][0]==items2[j][0]){
                sum.add(new ArrayList<>(Arrays.asList(items1[i][0],items1[i][1]+items2[j][1])));
                i++;j++;
            }else{
                sum.add(new ArrayList<>(Arrays.asList(items2[j][0],items2[j][1])));
                j++;
            }
        }
        while(i<items1.length){
            sum.add(new ArrayList<>(Arrays.asList(items1[i][0],items1[i][1])));i++;
        }
        while(j<items2.length){
            sum.add(new ArrayList<>(Arrays.asList(items2[j][0],items2[j][1])));j++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] items1 = {{5,1},{4,2},{3,3},{2,4},{1,5}};
        int[][] items2 = {{7,1},{6,2},{5,3},{4,4}};
        mergeSimilarItems(items1,items2);

    }
}
