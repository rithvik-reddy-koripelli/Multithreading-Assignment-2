package com.accolite.mini_au;

import java.util.concurrent.ArrayBlockingQueue;

public class Driver {
	public static void main(String [] args)
	{
		ArrayBlockingQueue<Item> bq = new ArrayBlockingQueue<Item>(10);
		Producer p = new Producer(bq);
		Consumer c = new Consumer(bq);
		p.start();
		c.start();
	}
}
