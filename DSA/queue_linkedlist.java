import java.util.Queue;
import java.util.LinkedList;
public class queue_linkedlist {
	public static void main(String[] args){
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		System.out.println(queue.isEmpty()); 
		System.out.println(queue.size());
		System.out.println(queue.contains("Harold"));
		System.out.println(queue.peek());
		queue.poll();//karen
		queue.poll();//chad
		queue.poll();//stev
		System.out.println(queue);
	}

}
