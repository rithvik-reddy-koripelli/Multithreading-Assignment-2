package com.accolite.mini_au;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{
	ArrayBlockingQueue <Item> bq;
	public Producer(ArrayBlockingQueue<Item> bq)
	{
		this.bq = bq;
	}
	
	public void run()
	{
		for(int i =1;i<=30;i++)
		{	
			Item o = new Item(i);
			try {
				System.out.println("Produced: "+o);
				bq.put(o);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
