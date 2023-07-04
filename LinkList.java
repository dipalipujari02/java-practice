import java.util.LinkedList;

public class LinkList {
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(87);
        ll.add(78);
        ll.add(65);
        ll.add(45);
        ll.add(11);
        ll.add(100);
        ll.add(21);

        System.out.println(ll);

        ll.add(4, 30);
        System.out.println(ll);

        System.out.println(ll.size());

        ll.addFirst(40);
        ll.addLast(3);

        System.out.println(ll);

        System.out.println(ll.get(4));
 

        System.out.println(ll.isEmpty());

        System.out.println(ll.peek());

        System.out.println(ll.poll());
        System.out.println(ll);

        System.out.println(ll.pop());

        ll.push(30);
        System.out.println(ll);

        ll.set(0, 9);
        System.out.println(ll);

        
    }
    
}
