/*
 * Class : L i s t N o d e
 * 
 * @Name : student name
 * @StdID: 20XXXXXXX
 * @Class: IT114105/1X
 * @2021-02-19
 */
public class ListNode {
    public Object data;   
    public ListNode next;
    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

