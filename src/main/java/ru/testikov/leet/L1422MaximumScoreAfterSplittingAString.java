package ru.testikov.leet;

//Input: s = "011101"
public class L1422MaximumScoreAfterSplittingAString {

    public static void main(String[] args) {
        System.out.println(maxScore("00"));
    }


    public static int maxScore(String s) {
        int sum = 0;
        int count = 1;
        while (count < s.length()) {
            String oneTemp = s.substring(count, s.length());
            String zeroTemp = s.substring(0, count);
            int oneCountTmp = oneTemp.length() - oneTemp.replace("1", "").length();
            int zeroCountTmp = zeroTemp.length() - zeroTemp.replace("0", "").length();
            if (oneCountTmp + zeroCountTmp >= sum) {
                sum = oneCountTmp + zeroCountTmp;
            }
            count++;
        }
        return sum;
    }
}
