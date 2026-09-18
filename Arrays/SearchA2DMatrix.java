public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r1 = 0;
        int r2 = matrix.length-1;
        int c1 = 0;
        int c2 = matrix[0].length-1;
        //int r = (r1+r2)/2;
        while(r1<r2){
            int r = (r1+r2)/2;
            if(matrix[r][c2]<target){
                r1 = r+1;
            }
            else if(matrix[r][c1]>target){
                r2 =r-1;
            }
            else{
                r1 = r;
                r2 = r;
            }
        }
            //applly binary search in this particular row now
            while(c1<=c2){
                int c = (c1+c2)/2;
                if(matrix[r1][c]==target){
                    return true;
                }
                else if(matrix[r1][c]>target){
                    c2 = c-1;
                }
                else{
                    c1 = c+1;;
                }
            }
            return false;
        
    }
}
