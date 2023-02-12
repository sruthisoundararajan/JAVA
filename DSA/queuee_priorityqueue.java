import java.util.*;
import java.util.Collections;
import java.util.PriorityQueue;
public class queuee_priorityqueue {
	public static void main(String args[])
	{
	Queue<Double> queue = new PriorityQueue<Double>();//ascending
	//Queue<Double> queue= new PriorityQueue<Double>(Collections.reverseOrder());// descending
	queue.offer(3.0);
	queue.offer(2.5);
	queue.offer(4.0);
	queue.offer(1.5);
	queue.offer(2.0);
	while(!queue.isEmpty()) {
	
	System.out.println(queue.poll());
	}
	}
}
