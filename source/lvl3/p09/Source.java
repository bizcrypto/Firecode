package source.lvl3.p09;

import source.support.datastructure.node.ListNode;

class Source {
    ListNode findNthNodeFromEnd(final ListNode head, final int n) {
        if(head == null || n <= 0) return null;
        ListNode node = head;
        int len = 1;
        while(node.next != null) {
            node = node.next;
            len++;
        }
        if(n > len) return null;
        node = head;
        for(int  i = 0; node != null && i < len-n; i++)
            node = node.next;
        return node;
    }
}
