package source.lvl4.p26;
import source.temp.list.SinglyLinkedList;
import source.temp.node.ListNode;
import java.util.*;
class Source {
    /* ********************************************************************* */
    private ListNode mergeKLists(ArrayList<ListNode> lists) {
        return null;
    }
    /* ********************************************************************* */
    public static void main(String[] args) {
        ArrayList<ListNode> lists = new ArrayList<>();
		int k = 0;
        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            SinglyLinkedList list = new SinglyLinkedList();
            for(int j = 0; j < Integer.parseInt(args[i+1]); j++) {
                list.append(Integer.parseInt(args[Integer.parseInt(args[0])+i+k+1]));
                k++;
            }
            k--;
            lists.add(list.head);
            list.print();
        }
        System.out.println(new Source().mergeKLists(lists));
    }
}
