package study;

import java.util.LinkedList;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * <p>
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 *
 * @author 860118060
 * @date 2019/10/8
 */
public class Reserve {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    private static int reverse(int x) {
        String startNum;
        LinkedList<Character> numArr = new LinkedList<Character>();
        startNum = x + "";
        for (int i = startNum.length() - 1; i >= 0; i--) {
            if (i == startNum.length() - 1 && (!"0".equals(String.valueOf(startNum.charAt(i))))) {
                numArr.add(startNum.charAt(i));
                continue;
            }
            if (i == 0 && ("-".equals(String.valueOf(startNum.charAt(i))))) {
                numArr.addFirst(startNum.charAt(i));
                continue;
            }
            numArr.add(startNum.charAt(i));
        }
        StringBuilder endNum = new StringBuilder();
        for (Character ch : numArr) {
            endNum.append(ch);
        }
        return Long.parseLong(String.valueOf(endNum)) > Integer.MAX_VALUE ? 0 : Integer.parseInt(String.valueOf(endNum));
    }
}
