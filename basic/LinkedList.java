package basic;

/**
 * @author: xyx & yx282947664@163.com
 * @date 2023/8/16 016 12:14
 * @description: TODO
 */
public class LinkedList {
    //线性表的定义
    int val;
    LinkedList next;

    public LinkedList(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(1);
        LinkedList linkedList2 = new LinkedList(2);
        LinkedList linkedList3 = new LinkedList(3);
        linkedList1.next = linkedList2;
        linkedList2.next = linkedList3;
        System.out.println(linkedList1.val);  //1
        System.out.println(linkedList1.next);
        System.out.println(linkedList1.next.val);  //2


    }
}
