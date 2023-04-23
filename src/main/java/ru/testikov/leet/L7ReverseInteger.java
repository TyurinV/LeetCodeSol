package ru.testikov.leet;

public class L7ReverseInteger {
    public int reverse(int x) {
        int plusMinus;
        int resultInt = 0;
        if (x < 0) {
            plusMinus = -1;
        } else plusMinus = 1;
        try {
            int y = Math.abs(x);
            String num = String.valueOf(y);
            String resultString = new StringBuilder(num).reverse().toString();
            resultInt = Integer.parseInt(resultString);

        } catch (Exception e) {
            System.out.println("Large");
        }
        return resultInt * plusMinus;
    }

    public static void main(String[] args) {
        System.out.println(new L7ReverseInteger().reverse(-15236));
    }
}
