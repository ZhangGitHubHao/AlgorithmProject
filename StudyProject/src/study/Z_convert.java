package study;

import java.util.Date;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 *
 * @author 860118060
 * @date 2019/10/12
 */
public class Z_convert {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }

    private static String convert(String s, int numRows) {
        if (s.length() == 0) {
            return "";
        }

        if (numRows == 1) {
            return s;
        }
        int colume = (numRows - 1) * (s.length() / (2 * numRows - 2)) +(s.length() % (2 * numRows - 2)) / numRows + (s.length() % (2 * numRows - 2)) % numRows*((s.length() % (2 * numRows - 2)) / numRows + 1);
        if (colume < 1) {
            colume = 1;
        }
        Character[][] strs = new Character[numRows][colume];
        int yushu;

        for (int i = 0, j = 0, k = 0; i < s.length(); i++) {
            yushu = i % (2 * numRows - 2);
            if (yushu < numRows) {
                strs[j][k] = s.charAt(i);
                j++;
            } else if (yushu > numRows) {
                k++;
                j--;
                strs[j][k] = s.charAt(i);
            } else if (yushu == numRows) {
                j = numRows - 1;
                k++;
                strs[j][k] = s.charAt(i);
            }
            if (yushu == 2 * numRows - 3) {
                k++;
                j = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < colume; j++) {
                if (strs[i][j] != null) {
                    sb.append(strs[i][j]);
                }
            }
        }
        return String.valueOf(sb);
    }
}
