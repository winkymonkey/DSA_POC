package org.example.dsa.zz2_queue.b_misc;

import org.example.dsa.zz2_queue.MyCircularQueue;


public class B02_designCircularQueue_usingArray {
	
	public static void main(String[] args) {
		MyCircularQueue queue = new MyCircularQueue();
		
		queue.enQueue(10);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(20);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(70);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.enQueue(80);
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
		
		queue.deQueue();
		System.out.println("dequque");
		System.out.println(queue + "---front:"+queue.front() + "---rear:"+queue.rear());
	}
	
}
