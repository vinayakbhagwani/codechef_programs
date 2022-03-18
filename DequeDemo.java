import java.util.*;

class DequeDemo {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<String>();

        deque.addFirst("A");
        deque.addFirst("B");
        deque.add("C");
        System.out.println(deque);
        int size=deque.size();
        System.out.println(size);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
