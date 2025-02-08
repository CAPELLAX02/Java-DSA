package LinkedList;

/**
 * LeetCode 21: Merge Two Sorted Lists
 */
public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // First linked list will be:   1 -> 2 -> 4
        ListNode list1_first = new ListNode(1);
        ListNode list1_second = new ListNode(2);
        ListNode list1_third = new ListNode(4);
        list1_first.next = list1_second;
        list1_second.next = list1_third;
        list1_third.next = null;

        // Second linked list will be:  1 -> 3 -> 4
        ListNode list2_first = new ListNode(1);
        ListNode list2_second = new ListNode(3);
        ListNode list2_third = new ListNode(4);
        list2_first.next = list2_second;
        list2_second.next = list2_third;
        list2_third.next = null;

        displayList(list1_first);  // 1 -> 2 -> 4
        displayList(list2_first); // 1 -> 3 -> 4

        ListNode mergedListHead = mergeTwoLists(list1_first, list2_first);

        displayList(mergedListHead);  // 1 -> 1 -> 2 -> 3 -> 4 -> 4
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

    static void displayList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
