package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Design Stack using array
 * ***************************************************************************************
 */

public class A01_designStack_usingArray {
	
	public static void main(String[] args) {
		MyStack1 stack = new MyStack1();
		System.out.println("initially:: " + stack);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.push(90);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
	}
	
}




class MyStack1 {
	
	private static final int MAXSIZE = 1000;
	private int top;
	private int A[];

	public MyStack1() {
		A = new int[MAXSIZE];
		top = -1;
	}
	
	
	
	public boolean isEmpty() {
		return (top < 0);
	}
	
	public int peek() {
		return top;
	}
	
	public boolean push(final int elem) {
		if (top >= MAXSIZE) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			A[++top] = elem;
			return true;
		}
	}
	
	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int elem = A[top--];
			return elem;
		}
	}
	
	
	
	@Override
	public String toString() {
		if (A == null)
            return null;
		if (top == -1)
            return "[]";

        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i=0; ; i++) {
            builder.append(A[i]);
            if (i == top)
                return builder.append(']').toString();
            builder.append(", ");
        }
	}
	
}



