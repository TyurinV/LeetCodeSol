package ru.testikov.leet;

public class L657RobotReturntoOrigin {
    public static void main(String[] args) {

    }

    public static boolean judgeCircle(String moves) {
        Integer[] res = new Integer[]{0, 0};

        for (char a : moves.toCharArray()) {
            Integer[] tmp = mov(a);
            res[0] = res[0] + tmp[0];
            res[1] = res[1] + tmp[1];
        }
        if (res[0] == 0 && res[1] == 0) return true;

        return false;
    }

    public static Integer[] mov(Character c) {
        return switch (c) {
            case 'L' -> new Integer[]{-1, 0};
            case 'R' -> new Integer[]{1, 0};
            case 'U' -> new Integer[]{0, 1};
            case 'D' -> new Integer[]{0, -1};
            default -> new Integer[]{0, 0};
        };
    }
}
