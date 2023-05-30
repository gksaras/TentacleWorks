package com.exercise;

public class Number_As_Text {
	
	public static void main(String[] args) {
        int num = 1000;
        String text = numberAsText(num);
        System.out.println(text);
    }

    static String numberAsText(int num) {
        if (num == 0) {
            return "zero";
        }

        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String text = "";

        if (num >= 1000000) {
            text += numberAsText(num / 1000000) + " million ";
            num %= 1000000;
        }

        if (num >= 1000) {
            text += numberAsText(num / 1000) + " thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            text += ones[num / 100] + " hundred ";
            num %= 100;
        }

        if (num >= 20) {
            text += tens[num / 10] + " ";
            num %= 10;
        } else if (num >= 10) {
            text += teens[num - 10] + " ";
            num = 0;
        }

        if (num > 0) {
            text += ones[num] + " ";
        }

        return text.trim();
    }

}
