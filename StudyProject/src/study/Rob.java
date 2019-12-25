package study;

/**
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{5,1,1,4};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                doubleSum += nums[i];
            }else {
                singleSum += nums[i];
            }
        }
        return Math.max(singleSum,doubleSum);
    }
}
