package com.jbd;

import java.util.ArrayList;

public class CustomArrayList {

	// number of inputs = n
	int n = 4;

	class Data {
		int roll;
		String name;
		int marks;
		String phone;

		public Data(int roll, String name, int marks, String phone) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}

	}

	public static void main(String[] args) {

		int[] roll = { 1, 2, 3, 4 };
		String[] name = { "Chinmay", "Digvijay", "Ninad", "Tanmay" };
		int[] marks = { 56, 78, 43, 96 };
		String[] phone = { "879856", "554678", "232214", "234478" };

		CustomArrayList cal = new CustomArrayList();
		cal.addValues(roll, name, marks, phone);

	}

	public void addValues(int[] roll, String[] name, int[] marks, String[] phone) {
		ArrayList<Data> al = new ArrayList<Data>();
		for (int i = 0; i < n; i++) {
			al.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}
		printValues(al);
	}

	public void printValues(ArrayList<Data> lsit) {
		for (int i = 0; i < n; i++) {
			Data data = lsit.get(i);
			System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
		}
	}

}
