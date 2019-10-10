package study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 *
 * @author 860118060
 * @date 2019/10/9
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdeaedadazettgha"));
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> subSet = new HashSet<>();
        int maxlenth = 0;
        for (int i = 0; i < s.length(); i++) {
            subSet.clear();
            for (int j = i; j < s.length(); j++) {
                if (subSet.contains(s.charAt(j))){
                    break;
                }
                subSet.add(s.charAt(j));
            }
            maxlenth = Math.max(maxlenth,subSet.size());
        }
        return maxlenth;
    }
}
