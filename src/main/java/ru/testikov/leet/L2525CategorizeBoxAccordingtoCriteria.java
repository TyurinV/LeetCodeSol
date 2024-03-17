package ru.testikov.leet;

public class L2525CategorizeBoxAccordingtoCriteria {
    public String categorizeBox(int length, int width, int height, int mass) {
        String a = null;
        String b = null;

        if (length + width + height >= 10000 || (long) length * width * height >= 1000000000) {
            a = "Bulky";
        }
        if (mass >= 100) b = "Heavy";

        if (a == "Bulky" && b == "Heavy") return "Both";
        if (a != "Bulky" && b != "Heavy") return "Neither";
        if (a == "Bulky" && b != "Heavy") return "Bulky";
        return "Heavy";
    }
}
