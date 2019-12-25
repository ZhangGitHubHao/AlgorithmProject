package study;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 *
 * @author 860118060
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.getPrefix(strs[0],strs[1]);
        for (int i = 2; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)){
                prefix = longestCommonPrefix.getPrefix(prefix,strs[i]);
            }
        }
        return prefix;
    }

    private String getPrefix(String str1, String str2){
        String prefix = "";
        int length = Math.min(str1.length(), str2.length());
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i)!=str2.charAt(i)){
                break;
            }
            prefix = str1.substring(0,i+1);
        }
        return prefix;
    }

}
