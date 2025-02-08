package LinkedList;

/**
 * LeetCode 141: Linked List Cycle
 * LeetCode 142: Linked List Cycle II
 */
public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static void main(String[] args) {
        // Create the special linked list for this question manually
        //
        //  3 --> 2 --> 0 --> -4
        //         \__________/
        //
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(hasCycle(first)); // true
        System.out.println(lengthOfCycle(first)); // 3

        // Second example (0 --> 1 --> 2 --> 3)
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        System.out.println(hasCycle(head)); // false
        System.out.println(lengthOfCycle(head)); // 0

        // third example
        //
        //  1 --> 3 --> 5 --> 7 --> 9
        //   \_____________________/
        //
        ListNode headNode = new ListNode(1);
        headNode.next = new ListNode(3);
        headNode.next.next = new ListNode(5);
        headNode.next.next.next = new ListNode(7);
        headNode.next.next.next.next = new ListNode(9);
        headNode.next.next.next.next.next = headNode;

        System.out.println(hasCycle(headNode)); // true
        System.out.println(lengthOfCycle(headNode)); // 5
    }

    static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // slow pointer speed:  V
            fast = fast.next.next; // fast pointer speed: 2V

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Extra: Find the length of the circle
    static int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
    }

    // Solution for the 142: Determines exactly the cycle begins in the given linked list
    static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find the length of the circle
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                length = lengthOfCycle(head);
                break;
            }
        }

        if (length == 0) return null;

        // Find the start node
        ListNode first = head;
        ListNode second = head;

        while (length > 0) {
            second = second.next;
            length--;
        }

        // Keep moving both forward and they will meet where cycle starts
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return second;
    }

}
