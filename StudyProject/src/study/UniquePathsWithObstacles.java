package study;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * @author 860118060
 * @date 2019/11/04
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{0,0,0};
        int[][] test = new int[1][2];
        test[0][0] = 1;
        test[0][1] = 0;
//        test[0][2] = 0;
//        test[1][0] = 0;
//        test[1][1] = 1;
//        test[1][2] = 0;
//        test[2][0] = 0;
//        test[2][1] = 0;
//        test[2][2] = 0;
        System.out.println(uniquePathsWithObstacles(test));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int[][] db = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i <obstacleGrid.length ; i++) {
            if (obstacleGrid[i][0]==1) {
                obstacleGrid[i][0]=0;
                break;
            }
            obstacleGrid[i][0] = 1;
        }
        for (int i = 1; i <obstacleGrid[0].length ; i++) {
            if (obstacleGrid[0][i]==1) {
                obstacleGrid[0][i]=0;
                break;
            }
            obstacleGrid[0][i] = 1;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j=1;j<obstacleGrid[0].length;j++){
                if (obstacleGrid[i][j]==1){
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
