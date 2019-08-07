package com.kiran;

import java.util.Arrays;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;

	}
}

class SingleLink {

	private static final int DEFAULT_CAPACITY = 10;

	Node head;

	public SingleLink() {

	}

	public boolean add(int a) {
		Node node = new Node(a);
		node.next = null;

		if (head == null) {

			head = node;
			return true;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			return true;
		}
	}

	public Object[] getAllData() {
		Object object[] = new Object[DEFAULT_CAPACITY];
		Node n = head;
		int i = 0;

		while (n.next != null) {

			if (object.length == i) {

				object = Arrays.copyOf(object, i + DEFAULT_CAPACITY);

			}
			object[i] = n.data;

			n = n.next;

			i++;

		}
		object[i] = n.data;
		System.out.println("After getting all data " + object.length);
		return object;
	}

	public void delete(int a) {
		Node n = head;

		while (n.next != null) {

			if (n.data == a) {
				head = n.next;

			} else if (n.next.data == a) {
				System.out.println("data is compared here");
				n.next = n.next.next;
			}

			else {
				n = n.next;

			}

		}

	}

}

public class DemoLinkedList {
	public static void main(String[] args) {
		SingleLink link = new SingleLink();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);

		link.add(5);
		/*
		 * link.add(6); link.add(1); link.add(2); link.add(3); link.add(4); link.add(5);
		 * link.add(6);
		 */

		/*
		 * Object[] objects = link.getAllData(); for (int i = 0; i < objects.length;
		 * i++) { if (objects[i] != null) { System.out.print(objects[i] + " "); }
		 * 
		 * }
		 */

		link.delete(5);

		Object[] objects1 = link.getAllData();
		for (int i = 0; i < objects1.length; i++) {
			if (objects1[i] != null) {
				System.out.print(objects1[i] + " ");
			}

		}
	}

}
