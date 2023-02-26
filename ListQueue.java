import java.util.LinkedList;

public class ListQueue {
     
    private LinkedList<Integer> linkedList = new LinkedList<>();
    void enqueue(int item) {
        linkedList.addLast(item);
    }
    Integer dequeue() {
        return empty() ? linkedList.pollFirst() : null;
    }
    Integer first() {
        return empty() ? linkedList.peekFirst() : null;
    }
    String toStr(){
        return linkedList.toString();
    }

    Boolean empty() {
        return linkedList.size() > 0;
    }
}