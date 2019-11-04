package study;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author 860118060
 * @date 2019/11/04
 */
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] db = new int[m][n];
        for (int i = 0; i < n; i++) {
            db[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            db[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j=1;j<n;j++){
                db[i][j] = db[i-1][j]+db[i][j-1];
            }
        }
        return db[m-1][n-1];
    }
}
