package linked_list.ispalindrome;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l.next = l2;
       // l2 = new ListNode(2);
      //  l.next = l2;
      //  l.next = new ListNode(5);
      //  l.next = null;
       System.out.println(isPalindrome(l));
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(isArrayPalindrome(arr));
    }

    public static boolean isPalindrome(ListNode head) {
            List<Integer> arr = new ArrayList<>();
            ListNode node = head;
            while (node != null) {
                arr.add(node.val);
                node = node.next;
            }
            return isArrayPalindrome(arr);
        }

        private static boolean isArrayPalindrome(List<Integer> arr) {
            for (int i = 0; i < arr.size() / 2; i++) {
                if (arr.get(i) != arr.get(arr.size() - 1 - i))
                    return false;
            }
            return true;
        }

}
