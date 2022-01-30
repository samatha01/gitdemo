package com.basics.demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue <> ();
         queue.add("India");
         queue.add("America");
         queue.add("Cuba");
         queue.add("France");
         System.out.println("The Original queue: "+queue);
         queue.remove();
         System.out.println("Queue after removing the head element: "+queue);
         String head=queue.peek();
         System.out.println("Head of the queue: "+head);
         head=queue.poll();
         System.out.println("Removed head: "+head);
         System.out.println("Now the queue looks like: "+queue);
	}

}
