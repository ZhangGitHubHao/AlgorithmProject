package study;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 *
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 *
 * @author 860118060
 * @date 2019/10/10
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,9};
        int[] nums2 = {};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length==0&&nums2.length==0){
            return 0;
        }
        double media = 0;
        int[] both = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,both,0,nums1.length);
        System.arraycopy(nums2,0,both,nums1.length,nums2.length);
        Arrays.sort(both);
        int mediaFlag = both.length%2;
        if (mediaFlag==0){
            media=(both[both.length/2-1]+both[both.length/2])/2.0;
        } else {
            media=both[both.length/2];
        }
        return media;
    }
}
