/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 错误用例：[0] [0]
 * 解决办法：
 * int numberOfDigits = String.valueOf(n).length()；
 * 判断长度才能取出正确位数
 * 错误用例：[9,9,9,9,9,9,9,9,9,9][9,9,9,9,9,9,9,9,9,9]
 * 解决办法：
 * 9位的话就要long了
 * 根本原因：没有说范围的话就是string，否则可能很长很长
 * 流程：个百千输入相加，加上进位，生成的是千百个，要求的是个百千，再转一次
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode list = null;
       ListNode pre = null;
       int v;
       int jingwei = 0; //记录进位
       while (l1 != null || l2 != null || jingwei > 0) {
           v = 0;
           if (l1 != null) {
               v = v + l1.val;
           }
           if (l2 != null) {
               v = v + l2.val;
           }
           if (jingwei > 0) {
               v = v + jingwei;
           }
           list = new ListNode(v % 10);
           list.next = pre;
           pre = list;
           
           if (l1 != null) {
               l1 = l1.next;
           }
           if (l2 != null) {
               l2 = l2.next;
           }
           jingwei = v / 10;
       }
       ListNode revs = null;
        pre = null;
        while (list != null) {
            revs = new ListNode(list.val);
            revs.next = pre;
            pre = revs;
            list = list.next;
        }
       return revs;
    }
}
        /** 
        在Java中一个数的N次方不可以写成：a^0这种形式，算得的数不正确；
正确的写法为Math.pow(a,0);
         *Math.sqrt()//计算平方根
         *Math.cbrt()//计算立方根
         *Math.pow(a, b)//计算a的b次方
         *Math.max( , );//计算最大值
         *Math.min( , );//计算最小值
         */  
