package ArrayPractice;

//O- https://leetcode.com/problems/flipping-an-image/
public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans = new int[image.length][];
        for(int row=0; row< image.length; row++){
            int start = 0;
            int end = image.length-1;
            while (start < end) {
                int temp = image[row][start];
                image[row][start] = image[row][end];
                image[row][end] = temp;
                start++;
                end--;
            }
            for(int col=0; col<image[row].length; col++){
                if(image[row][col] == 0){
                    image[row][col] = 1;
                } else {
                image[row][col] = 0;
                }
                System.out.print(image[row][col]);
            }
            System.out.println();
        }
    }
}
