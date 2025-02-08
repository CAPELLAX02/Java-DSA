package LinkedList;

/**
 * LeetCode 148: Sort List
 */
public class SortList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Example linked list: [4, 2, 1, 3]
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println(sortList(head)); // [1, 2, 3, 4]

        // Another example: [-1, 5, 3, 4, 0]
        ListNode headNode = new ListNode(-1);
        headNode.next = new ListNode(5);
        headNode.next.next = new ListNode(3);
        headNode.next.next.next = new ListNode(4);
        headNode.next.next.next.next = new ListNode(0);

        System.out.println(); // [-1, 0, 3, 4, 5]
    }

    static ListNode sortList(ListNode head) {
        return null;
        // TODO: complete the method
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode cur = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        while (list1 != null) {
            cur.next = list1;
            list1 = list1.next;
            cur = cur.next;
        }

        while (list2 != null) {
            cur.next = list2;
            list2 = list2.next;
            cur = cur.next;
        }

        return mergedList.next;
    }

}
