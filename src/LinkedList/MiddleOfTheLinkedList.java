package LinkedList;

/**
 * LeetCode 876: Middle of the Linked List
 */
public class MiddleOfTheLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Example linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(middleNode(head)); // 3

        // Note: if there are even number of nodes, meaning if we have two middle nodes,
        // we should return the second middle node

        // Second example: [0, 3, 5, 1, 2, 6, 7, 9]
        ListNode firstNode = new ListNode(0);
        firstNode.next = new ListNode(3);
        firstNode.next.next = new ListNode(5);
        firstNode.next.next.next = new ListNode(1);
        firstNode.next.next.next.next = new ListNode(2);
        firstNode.next.next.next.next.next = new ListNode(6);
        firstNode.next.next.next.next.next.next = new ListNode(7);
        firstNode.next.next.next.next.next.next.next = new ListNode(9);

        System.out.println(middleNode(firstNode)); // 2
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
