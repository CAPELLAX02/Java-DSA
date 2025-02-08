package LinkedList;

/**
 * LeetCode 83: Remove Duplicates from Sorted List
 */
public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Create a sorted linked list with some duplicated values:
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(2);
        ListNode fourthNode = new ListNode(3);
        ListNode fifthNode = new ListNode(4);
        ListNode sixthNode = new ListNode(4);
        ListNode tailNode = new ListNode(5);
        headNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = tailNode;
        tailNode.next = null;

        displayList(headNode);
        // output: 1 -> 2 -> 2 -> 3 -> 4 -> 4 -> null

        ListNode updatedHead = deleteDuplicates(headNode);

        displayList(updatedHead);
        // output: 1 -> 2 -> 3 -> 4 -> null
    }

    static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
        return temp;
    }

    static void displayList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
