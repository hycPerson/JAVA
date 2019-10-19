/*
*https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/
*/
/*
 * java并没有提供好的数组和字符串查找工具，只有一个indexOf
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = s.length();
       char[] c = s.toCharArray();
       int count = 0;
       int lf = 0, rg = 0;
       while(rg < l) {
          if (search(c, lf, rg, c[rg]) < 0) {
              rg++;
              if (rg - lf >= count) {
                  count = rg - lf;
                  
              }
          } else {
              lf = search(c, lf, rg, c[rg]) + 1;
              rg++;
          }
       }
       return count;
    }
    public static int search(char[] aa, int fromIndex, int toIndex, char ch) {
        for(int i = fromIndex; i < toIndex; i++) {
            if(aa[i] == ch) {
                return i;
            }
        }
        return -1;
    }
   
}