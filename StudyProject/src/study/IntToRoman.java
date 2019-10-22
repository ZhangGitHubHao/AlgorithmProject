package study;

import java.util.Arrays;

/**
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: "III"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "IV"
 * 示例 3:
 *
 * 输入: 9
 * 输出: "IX"
 * 示例 4:
 *
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 示例 5:
 *
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 *
 * @author 860118060
 */
public class IntToRoman {
    public String intToRoman(int num) {
        if (num>3999||num<1){
            return "数值不符合范围";
        }
        StringBuilder sb = new StringBuilder();
        int ge = num%10;
        int shi = (num/10)%10;
        int bai = ((num/10)/10)%10;
        int qian = num/1000;

        if (qian>0){
            for (int i = 0; i < num/1000; i++) {
                sb.append("M");
            }
        }
        if (bai>0){
            switch (bai){
                case 1:
                    sb.append("C");
                    break;
                case 2:
                    sb.append("CC");
                    break;
                case 3:
                    sb.append("CCC");
                    break;
                case 4:
                    sb.append("CD");
                    break;
                case 5:
                    sb.append("D");
                    break;
                case 6:
                    sb.append("DC");
                    break;
                case 7:
                    sb.append("DCC");
                    break;
                case 8:
                    sb.append("DCCC");
                    break;
                case 9:
                    sb.append("CM");
                    break;
                default:
                    break;
            }
        }
        if (shi>0){
            switch (shi){
                case 1:
                    sb.append("X");
                    break;
                case 2:
                    sb.append("XX");
                    break;
                case 3:
                    sb.append("XXX");
                    break;
                case 4:
                    sb.append("XL");
                    break;
                case 5:
                    sb.append("L");
                    break;
                case 6:
                    sb.append("LX");
                    break;
                case 7:
                    sb.append("LXX");
                    break;
                case 8:
                    sb.append("LXXX");
                    break;
                case 9:
                    sb.append("XC");
                    break;
                default:
                    break;
            }
        }
        if (ge>0){
            switch (ge){
                case 1:
                    sb.append("I");
                    break;
                case 2:
                    sb.append("II");
                    break;
                case 3:
                    sb.append("III");
                    break;
                case 4:
                    sb.append("IV");
                    break;
                case 5:
                    sb.append("V");
                    break;
                case 6:
                    sb.append("VI");
                    break;
                case 7:
                    sb.append("VII");
                    break;
                case 8:
                    sb.append("VIII");
                    break;
                case 9:
                    sb.append("IX");
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }
    public String intToRoman2(int num){
        // 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中
        // 并且按照阿拉伯数字的大小降序排列，这是贪心选择思想
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                // 注意：这里是等于号，表示尽量使用大的"值"
                stringBuilder.append(romans[index] + " ");
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        String[] strs = new String[]{"hello"};
        System.out.println(intToRoman.expressiveWords("heeellooo",strs));
    }
    public int addDigits(int num) {
        int x = 0;
        do {
            x += num%10;
            num/=10;
        }while (num>0);
        if (x<10){
            return x;
        }else {
            return addDigits(x);
        }

    }

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        return A[0]+K>A[A.length-1]-K?0:A[A.length-1]-K-A[0]+K;
    }

    public int expressiveWords(String S, String[] words) {
        int res = 0;
        boolean okflag = false;
        int threeflag = 0;
        int falg = 0;
        boolean for2flag = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (for2flag){
                    for2flag = true;
                    break;
                }
                for (int k = falg; k < S.length(); k++) {
                    if (words[i].charAt(j)==S.charAt(k)){
                        falg = k+1;
                        break;
                    }else {
                        if (words[i].charAt(j-1)==S.charAt(k)){
                            threeflag++;
                            continue;
                        }
                        if (threeflag>3){
                            okflag = true;
                        }
                        for2flag = true;
                        break;
                    }
                }
                if (okflag){
                    res++;
                    okflag = false;
                    threeflag = 0;
                }
            }
        }
        return res;
    }
}
