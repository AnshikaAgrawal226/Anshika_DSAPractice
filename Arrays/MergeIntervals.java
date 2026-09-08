import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
       //sort the given array on the basis of first index (intervals[i][0])
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        //System.out.println(Arrays.deepToString(intervals));

        //ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int left =0;
        int right = 1;
        int x =0;
        int[][] ans = new int[intervals.length-1][2];
        
        while(left<intervals.length-1){
            if(left == 0){
                ans = new int[intervals.length-1][2];
            }
            
            //int[][] ans = new int[intervals.length-1][2];
            
            if(intervals[left][1]>=intervals[right][1]){
                //list.add(intervals[left]);
                
                
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
                //System.out.println(Arrays.deepToString(intervals));
                left =0;
                right =1;
                x=0;
            }
            else if(intervals[left][1]>=intervals[right][0]){
                //int[][] ans = new int[intervals.length-1][2];
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
                //System.out.println(Arrays.deepToString(intervals));

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
