package com.coding.library.Model;

public class HexToDec {
    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        System.out.println(val);
        return val;
    }

    public static void main(String args[]) {
        hex2decimal("7D");
    }
}
