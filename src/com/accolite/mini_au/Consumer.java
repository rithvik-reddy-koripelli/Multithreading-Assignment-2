package com.accolite.mini_au;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread{
	ArrayBlockingQueue<Item> bq;
	
	public Consumer(ArrayBlockingQueue<Item> bq)
	{
		this.bq = bq;
	}
	
	public void run()
	{
		for(int j =0;j<30;j++) {
		try {
			Item i = bq.take();
			System.out.println("Consumed "+i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
