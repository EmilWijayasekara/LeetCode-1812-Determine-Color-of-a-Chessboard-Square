/*
 * @lc app=leetcode id=1812 lang=java
 *
 * [1812] Determine Color of a Chessboard Square
 */

// @lc code=start
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a,b;
        a=coordinates.charAt(0);
        b=coordinates.charAt(1)-'0';

        if((a+b)%2 == 0) return false;
        else return true;
    }
}
// @lc code=end

