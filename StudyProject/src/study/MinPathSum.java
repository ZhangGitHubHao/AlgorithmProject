package study;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 *   [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 *
 * @author 860118060
 * @date 2019/11/05
 */
public class MinPathSum {
    public static void main(String[] args) {
        int[][] test = new int[2][3];
        test[0][0] = 1;
        test[0][1] = 2;
        test[0][2] = 5;
        test[1][0] = 3;
        test[1][1] = 2;
        test[1][2] = 1;
//        test[2][0] = 4;
//        test[2][1] = 2;
//        test[2][2] = 1;
        System.out.println(minPathSum(test));
    }

    public static int minPathSum(int[][] grid) {
        int[][] weight = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            if (i>0){
                weight[i][0] = grid[i][0]+weight[i-1][0];
            }else {
                weight[i][0] = grid[i][0];
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            if (i>0){
                weight[0][i] = grid[0][i]+weight[0][i-1];
            }
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                weight[i][j] = grid[i][j]+Math.min(weight[i-1][j],weight[i][j-1]);
            }
        }
        return weight[grid.length-1][grid[0].length-1];
    }
}
