package gfg_160.strings.medium.easy;

public class NumberToRoman {

    String convertToRoman(int n) {
        //code here
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                result.append(roman[i]);
                n -= values[i];
            }
        }

        return result.toString();

    }
}
