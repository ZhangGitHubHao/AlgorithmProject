package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 860118060
 */
public class IsValid {
    public static void main(String[] args) {
        String str = "()\n11";
        System.out.println(str);
    }

    private static boolean isValid(String s) {
        Map<String, String> match = new HashMap<>(3);
        match.put("(", ")");
        match.put("[", "]");
        match.put("{", "}");
        int flag = 0;
        String left = String.valueOf(s.charAt(flag));

        for (int i = 0; i < s.length(); i++) {

        }
        return true;
    }
}
