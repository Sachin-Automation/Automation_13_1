package Collection103;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new PriorityQueue();
		// while adding element in Queue, it will always keep smallest element on the
		// top
		queue.add(10);
		queue.add(50);
		queue.add(101);
		queue.add(205);
		queue.add(230);
		System.out.println("size of Eement:" + queue.size());// 5
		System.out.println("Elements of queue is:" + queue);// [10,50,101,205,230]
		// element() returns top most element of the queue, if the queue if empty dn it
		// will throw an exception by name 'NoSuchElementException'
		System.out.println("head elements of the queue is :" + queue.element());// 10
		// peek() returns top most element of the queue, if the queue if empty dn it
		// will return 'null' instead of throwing exception
		System.out.println("head elements of the queue is :" + queue.peek());// 10

		System.out.println("iterating the queue elements using for-each loop:");
		for (Object O : queue) {
			System.out.println(" print elements:" + O);

		}
		System.out.println("iterating the queue elements using Iterator:");
		Iterator I1 = queue.iterator();
		while (I1.hasNext()) {
			System.out.println(I1.next());

		}
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will throw an exception by name 'NoSuchElementException'
		System.out.println("removing elements form queue useing remove method:" + queue.remove());// 10 remove from
																									// queue
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will return 'null' value
		System.out.println("remove elements from queue by useing pool methad:" + queue.poll());// 50
		System.out.println("Eleements of Queue: " + queue);

		System.out.println("iterating the queue elements using Iterator:");
		Iterator I2 = queue.iterator();
		while (I2.hasNext()) {
			System.out.println(I2.next());
		}
		System.out.println("*********************");
		//using lamda expression
		queue.forEach(obj->{System.out.println(obj);});
	}

}
