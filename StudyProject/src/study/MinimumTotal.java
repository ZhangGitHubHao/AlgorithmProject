package study;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 例如，给定三角形：
 * <p>
 *  [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 * 说明：
 * <p>
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 *
 * @author 860118060
 * @date 2019/11/07
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] ans = new int[triangle.size()];
        int[] temp = new int[triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i == 0) {
                    ans[i] = triangle.get(i).get(i);
                    break;
                }
                if (j == 0) {
                    ans[j] = temp[j] + triangle.get(i).get(j);
                } else if (j==triangle.get(i).size()-1){
                    ans[j] = temp[j-1] + triangle.get(i).get(j);
                } else {
                    ans[j] = Math.min(temp[j-1],temp[j]) + triangle.get(i).get(j);
                }
            }
            temp = ans.clone();
        }
        Arrays.sort(ans);
        return ans[0];
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int[] ans = new int[triangle.size()];
        for (int i = triangle.size()-1; i >=0; i--) {
            for (int j = 0; j < triangle.get(i).size()-1; j++) {
                if (i == triangle.size()-1){
                    ans[j] = triangle.get(i).get(j);
                }else {
                    ans[j] = Math.min(ans[j],ans[j+1]) + triangle.get(i).get(j);
                }
            }
        }
        return ans[0];
    }
}
