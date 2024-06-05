package ArrayPractice;

//Q- https://leetcode.com/problems/matrix-diagonal-sum/
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                if(row == col){
                    sum += mat[row][col];
                }
            }
        }
        int i = mat.length-1;
        for(int row=0; row<mat.length; row++){
            for(int col=mat.length-1; col>=0; col--){
                if(col == i){
                    sum += mat[row][col];
                }
            }
            i = i-1;
        }
        if(mat[0].length %2 == 1){
            sum = sum - mat[mat[0].length/2][mat[0].length/2];
        }
        System.out.println(sum);
    }
}
