package source.support.datastructure.list;
import source.support.datastructure.node.ListNode;
public class SinglyLinkedList {
    public ListNode head;
    public void append(int data) {
        ListNode node = new ListNode(data);
        if(head != null) {
            ListNode temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        } else head = node;
    }
    public void clear() {head = null;}
    public void print() {System.out.print(toString());}
    @Override
    public String toString() {
        String s = "";
        if(head != null) {
            ListNode temp = head;
            while(temp.next != null) {
                s += "[" + temp.data + "] --> ";
                temp = temp.next;
            }
            s += "[" + temp.data + "] --> X\n";
        } else s = "[X]\n";
        return s;
    }
}
