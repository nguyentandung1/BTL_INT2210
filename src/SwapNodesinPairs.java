public class SwapNodesinPairs {

    public static class ListNode {
        int val;
        SwapNodesinPairs.ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, SwapNodesinPairs.ListNode next) { this.val = val; this.next = next; }
    }

    public static SwapNodesinPairs.ListNode swapPairs(SwapNodesinPairs.ListNode head) {
        // THCS
        if(head == null) return null;
        if(head.next == null) return head;

        // THTQ
        SwapNodesinPairs.ListNode nextNode = head.next;
        // Swap head & nextNode
        head.next = nextNode.next;
        nextNode.next = head;

        // Xu ly bai toan con
        SwapNodesinPairs.ListNode newHead = swapPairs(head.next);
        // Noi bai toan hien tai, vao bai toan con
        head.next = newHead;

        return nextNode;
    }

    public  static void printLinkedList(SwapNodesinPairs.ListNode head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapNodesinPairs.ListNode n1 = new SwapNodesinPairs.ListNode(1);
        SwapNodesinPairs.ListNode n2 = new SwapNodesinPairs.ListNode(2);
        SwapNodesinPairs.ListNode n3 = new SwapNodesinPairs.ListNode(3);
        SwapNodesinPairs.ListNode n4 = new SwapNodesinPairs.ListNode(4);
        n1.next = n2; n2.next = n3; n3.next = n4;

        printLinkedList(n1);
        SwapNodesinPairs.ListNode newList = swapPairs(n3);
        printLinkedList(newList);
    }

}
