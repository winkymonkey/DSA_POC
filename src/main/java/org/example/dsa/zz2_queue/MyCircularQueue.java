package org.example.dsa.zz2_queue;

public class MyCircularQueue {
	private static final int SIZE = 10;
	private int A[];
	private int front, rear;

	public MyCircularQueue() {
		A = new int[SIZE];
		front = -1;
		rear = -1;
	}
	
	
	
	/* ************************************************************ */
	public void enQueue(int value) {
		if ((front == 0  &&  rear == SIZE-1) || (rear+1 == front))
			System.out.println("--OVERFLOW--");
		
		else if (front == -1) {
			front = rear = 0;
			A[rear] = value;
		}

		else if(front != 0  &&  rear == SIZE-1) {
			rear = 0;
			A[rear] = value;
		}
		else {
			rear++;
			A[rear] = value;
		}
	}
	
	public void deQueue() {
		if (front == - 1)
			System.out.println("--UNDERFLOW--");
		
		else if (front == rear)
			front = rear = -1;
		
		else if (front==SIZE-1)
			front=0;
		
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
