package com.coding.library.Model;

public class DecToRom {
        private static final String[] romanNumerals = {"I", "IV", "V", "IX", "X","XL", "L","CX", "C", "CD", "D","CM", "M"};
        private static final int[] decimalNumerals = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        private int decimal;

        public DecToRom(int decimal) {
            this.decimal = decimal;
        }

        public int getDecimal() {
            return decimal;
        }

        public void setDecimal(int decimal) {
            this.decimal = decimal;
        }

        public String result() {
            String roman = "";

            for (int i = decimalNumerals.length - 1; i >= 0; i--) {
                while (this.decimal >= decimalNumerals[i]) {
                    roman += romanNumerals[i];
                    this.decimal -= decimalNumerals[i];
                }
            }

            return roman;
        }
    }

