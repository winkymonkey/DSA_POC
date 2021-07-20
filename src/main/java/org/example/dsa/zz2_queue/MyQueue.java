package org.example.dsa.zz2_queue;

public class MyQueue {
	private static final int SIZE = 5;
	private int A[];
	private int front, rear;

	public MyQueue() {
		A = new int[SIZE];
		front = -1;
		rear = -1;
	}
	
	
	
	/* ************************************************************ */
	public void enQueue(int value) {
		if (rear == SIZE-1)
			System.out.println("--OVERFLOW--");
		
		else if (front == -1) {
			front = 0;
			rear++;
			A[rear] = value;
		}
		
		else {
			rear++;
			A[rear] = value;
		}
		System.out.println("Add "+value);
	}
	
	public void deQueue() {
		if (front == - 1)
			System.out.println("--UNDERFLOW--");
		
		else if (front == rear)
			front = rear = -1;
		
		else
			front++;
	}
	
	
	
	/* ************************************************************ */
	public int front() {
		if(front == -1)
			return -1;
		else
			return A[front];
	}
	
	public int rear() {
		if(rear == -1)
			return -1;
		else
			return A[rear];
	}
	
	
	
	/* ************************************************************ */
	@Override
	public String toString() {
		if(A == null)
            return null;
		if(front==-1 && rear==-1)
			return "[]";
		
		StringBuilder builder = new StringBuilder();
        builder.append('[');
        
        for (int i=front; ;i++) {
        	builder.append(A[i]);
        	if(i == rear)
                return builder.append(']').toString();
        	builder.append(", ");
        }
	}
}
