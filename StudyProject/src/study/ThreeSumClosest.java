package study;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 *
 * @author 860118060
 * @date 2019/10/30
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,0};
        System.out.println(threeSumClosest(nums,-100));
    }
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length<3){
            return 0;
        }
        int sum=0;
        int ans = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            int j = i+1;
            int k = nums.length-1;

            while (j<k){
                sum = nums[i]+nums[j]+nums[k];
                if (sum==target){
                    return sum;
                }else if (sum>target){
                    k--;
                }else {
                    j++;
                }
                if (Math.abs(ans-target)>Math.abs(sum-target)){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
