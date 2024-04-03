package ru.testikov.leet;
// 476. Number Complement
public class L476NumberComplement {
    public int findComplement(int num) {
        StringBuilder a = new StringBuilder(Integer.toBinaryString(num));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                result.append("1");
            } else result.append("0");
        }
        int res = Integer.parseInt(result.toString(), 2);
        return res;
    }
}
