package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// (Head) 10 9 8 7 6 5 4 3 2 1 (Tail)
		
		// PQ will sort the Queue data
		// (Head) 1 2 3 4 5 6 7 8 9 10 (Tail)
		
		/*System.out.println(queue.peek()); // peek method return head of the Queue
		System.out.println(queue.peek());
		System.out.println(queue.peek());*/
		
		/*System.out.println(queue.poll()); //1   // poll will remove the head and return it
		System.out.println(queue.peek()); //2
		System.out.println(queue.poll()); //2
		System.out.println(queue.poll()); //3
		System.out.println(queue.peek()); //4*/
		
		for(int i=1;i<=queue.size();i++){
			System.out.println(queue.poll());
		}

	}

}
