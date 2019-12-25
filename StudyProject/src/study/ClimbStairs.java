package study;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 1       1
 * 2       2
 * 3       3
 * 4       5
 * 5       8
 * 6       13
 * 7       21
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 *
 * @author 860118060
 * @date 2019/11/5
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }
    public static int climbStairs(int n) {
        int ans1 = 1;
        int ans = 1;
        int temp = 0;

        int i = 2;
        while (i<=n){
            temp = ans;
            ans = ans1+ans;
            ans1 = temp;
            i++;
        }
        return ans;
    }
}
