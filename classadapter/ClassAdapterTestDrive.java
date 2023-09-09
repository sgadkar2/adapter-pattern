package classadapter;

public class ClassAdapterTestDrive {
    
    public static void main(String[] args) {

        DLlist<Integer> dLlist = new DLlist<>();

        Deque<Integer> deque = new DequeImpl<>();

        deque.addFirst(5);
        deque.addLast(6);
        deque.addFirst(3);

        System.out.println(deque.size());
        System.out.println(deque.peek());
        System.out.println(deque.peekLast());
        System.out.println(deque.poll());
        System.out.println(deque.size());
        System.out.println(deque.peek());
    }
}
