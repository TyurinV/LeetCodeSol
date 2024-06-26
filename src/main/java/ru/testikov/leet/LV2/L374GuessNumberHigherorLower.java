package ru.testikov.leet.LV2;
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class L374GuessNumberHigherorLower {
    public int guessNumber(int n) {
        long left = 0;
        long right = n;
        while (left <= right) {
            long mid = (right + left) / 2;
            if (guess((int)mid) == 0) return (int)mid;
            if (guess((int)mid) == 1) left = mid+1;
            else right = mid - 1;
        }
        return (int)left;
    }
}
