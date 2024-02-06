import java.util.*;

 public class MyArrayList extends ArrayList<Integer> {
    public ArrayList<Integer> search(Integer data) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            if (data.equals(this.get(i))) {
                array.add(i);
            }
        }

        return array;
    }

    public Queue getQueue() {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < this.size(); i++) {
            queue.add(this.get(i));
        }

        return queue;
    }

    public Stack getStack() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < this.size(); i++) {
            stack.push(this.get(i));
        }
        return stack;
    }
}
