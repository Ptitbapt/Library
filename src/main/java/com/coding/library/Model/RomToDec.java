package com.coding.library.Model;

public class RomToDec {
    private static final String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private static final int[] decimalNumerals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private String romanNumeral;

    public RomToDec(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    public void setRomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    public int result() {
        int decimal = 0;
        int i = 0;

        while (i < romanNumerals.length) {
            if (this.romanNumeral.startsWith(romanNumerals[i])) {
                decimal += decimalNumerals[i];
                this.romanNumeral = this.romanNumeral.substring(romanNumerals[i].length());
            } else {
                i++;
            }
        }
        return decimal;
    }
}

