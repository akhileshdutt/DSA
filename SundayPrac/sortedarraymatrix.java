package SundayPrac;

public class sortedarraymatrix {
    
    static int[] binsearch(int matrix[][], int target, int row, int cStart, int cEnd){
        while(cStart<cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==1){
            return binsearch(matrix, target, 0,0, col-1);
        }
        int rStart = 0 ;
        int rEnd = row-1;
        int cMid = col/2;

        while(rStart>rEnd){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid+1;
            }else{
                rEnd= mid-1;
            }
        }
        return new int[]{-1,-1};

    }
}
