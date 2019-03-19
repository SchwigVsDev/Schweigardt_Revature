package com.java.multithreading;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyList list = new MyList();

		Thread t = new Thread(() -> Stream.iterate(1, f -> f + 1).limit(100).forEach(x -> list.add()));

		Thread t2 = new Thread(() -> Stream.iterate(1, f -> f + 1).limit(100).forEach(x -> {
			try {
				list.remove();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));

		t.start();
		t2.start();

		t.join();
		t2.join();
		list.length();
	}

}

class MyList {
	volatile List<Integer> list = new ArrayList<>();

	public synchronized void add() {
		list.add((int) Math.random() * 100);
		notify();
	}

	public synchronized void remove() throws InterruptedException {
		if (list.size() <= 0) {
			wait();
		}

		list.remove(0);
	}

	public void length() {
		System.out.println(this.list.size());
	}
}
