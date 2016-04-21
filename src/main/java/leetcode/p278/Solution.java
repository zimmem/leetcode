package leetcode.p278;
/*
 * The isBadVersion API is defined in the parent class VersionControl. boolean isBadVersion(int version);
 */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int b = 1, e = n;

        while (b != e) {
            int mid = b/2 + e/2;
            if (isBadVersion(mid)) {
                e = mid;
            } else {
                b = mid + 1;
            }
        }
        return b;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(2126753390));
    }

}
