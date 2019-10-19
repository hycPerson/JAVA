//https://leetcode-cn.com/problems/median-of-two-sorted-arrays/submissions/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0, b = 0;
        int tl = nums1.length + nums2.length;
        if (tl == 0 )
            return 0.0;
        if (tl % 2 == 0) {
            a = tl / 2;
            b = a - 1;
        } else {
            a = tl / 2;
            b = -1;
        }
        int i = 0, j = 0;
        int res1 = 0, res2 = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (i + j == a)
                    res1 = nums1[i];
                if (i + j == b)
                    res2 = nums1[i];
                i++;
                continue;
            } else  {
                if (i + j == a)
                    res1 = nums2[j];
                if (i + j == b)
                    res2 = nums2[j];
                j++;
                continue;
            }
        }
        while ( i < nums1.length) {
            if (i + j == a)
                res1 = nums1[i];
            if (i + j == b)
                res2 = nums1[i];
            i++;
        }
        while ( j < nums2.length) {
            if (i + j == a)
                res1 = nums2[j];
            if (i + j == b)
                res2 = nums2[j];
            j++;
        }
        if (res2 == 0)
            res2 = res1;
        return (res1 + res2) / 2.0;
    }
}