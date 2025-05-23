// in this question, we have been given a sorted matrix, first find the miidle element and then remove extra rows and the search in it.

import java.util.Scanner;
import java.util.Arrays;
public class sortedBinary2d {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.print("Which element you want to search (in between 1-16): ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(Arrays.toString(search(matrix, target)));        

    }
    static int[] binsearch(int[][] matrix,int row, int target, int cStart, int cEnd){
        while(cStart<=cEnd){    
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;
        if(rows == 1){
            return binsearch(matrix, 0, target, 0, col-1);
        }
        
        int rStart = 0 ;
        int rEnd = rows-1;
        int cmid = col/2;

        while(rStart<(rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //now we have two rows
        // check whether the target is in the col of 2 rows

        if(matrix[rStart][cmid] == target){
            return new int[]{rStart,cmid};
        }
        if(matrix[rStart+1][cmid] == target){
            return new int[]{rStart+1,cmid};
        }
        //Search in 1st part
        if(target<=matrix[rStart][cmid-1]){
            return binsearch(matrix, rStart, target, 0, cmid-1);
        }
        //Search in 2st part
        if(target>=matrix[rStart][cmid+1] && target<=matrix[rStart][col-1]){
            return binsearch(matrix, rStart+1, target, cmid+1, col-1);
        }
        //Search in 3st part
        if(target<=matrix[rStart+1][cmid-1]){
            return binsearch(matrix, rStart+1, target, 0, cmid-1);
        }
        //Search in 4st part
        else{
            return binsearch(matrix, rStart+1, target, cmid+1, col-1);
        }
        
        

        // return new int[]{-1, -1};
    }
}
