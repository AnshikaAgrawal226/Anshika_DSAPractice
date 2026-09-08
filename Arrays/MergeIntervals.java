import java.util.ArrayList;
import java.util.Arrays;
/* 
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
       //sort the given array on the basis of first index (intervals[i][0])
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int left =0;
        int right = 1;
        int x =0;
        int[][] ans = new int[intervals.length-1][2];
        
        while(left<intervals.length-1){
            if(left == 0){
                ans = new int[intervals.length-1][2];
            }
            
            if(intervals[left][1]>=intervals[right][1]){
                ans[x][0] = intervals[left][0];
                ans[x][1] = intervals[left][1];
                x++;

                right++;
                while(right<intervals.length){
                    ans[x][0] = intervals[right][0];
                    ans[x][1] = intervals[right][1];

                    right++;
                    x++;
                }
                intervals = ans;
                left =0;
                right =1;
                x=0;
            }
            else if(intervals[left][1]>=intervals[right][0]){
                ans[x][0] = intervals[left][0];
                ans[x][1] = intervals[right][1];
                right++;
                x++;
                while(right<intervals.length){
                    ans[x][0] = intervals[right][0];
                    ans[x][1] = intervals[right][1];
                    right++;
                    x++;
                }
                intervals = ans;
                left =0;
                right =1;
                x=0;
            }
            else{
                ans[x][0] = intervals[left][0];
                ans[x][1] = intervals[left][1];
                left++;
                right++;
                x++;
            }
        }
        return intervals;

    }
}
    */

//Optimised solution
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
       //sort the array on basis of first index<
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i =1;i<intervals.length;  i++ ){
            //overlaping intervals
            if(end>=intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
            }
            //not overlaping
            else{
                list.add(new int[]{start,end});
                start= intervals[i][0];
                end = intervals[i][1];
            }
            
        }
        list.add(new  int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
    
}

