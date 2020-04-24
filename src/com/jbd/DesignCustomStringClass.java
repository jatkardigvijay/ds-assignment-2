package com.jbd;

import java.util.Arrays;

public final class DesignCustomStringClass {

	private final char[] data;

	public DesignCustomStringClass(char[] data) {
		super();
		this.data = Arrays.copyOf(data, data.length);
	}

	public int length() {
		return data.length;
	}

	public int indexOfChar(char alphabet) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == alphabet) {
				return i;
			}
		}
		return 1;
	}

	public String toUppercase(String s) {
		String result = "";
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) + 32);
			} else {
				ch = s.charAt(i);
			}
			result = result + ch;
		}
		return result;
	}

	public static void main(String[] args) {

		char[] data = { 'a', 'b', 'c' };
		String str1 = "digvijay";

		DesignCustomStringClass d = new DesignCustomStringClass(data);

		System.out.println("Length is : " + d.length());
		System.out.println("Index is : " + d.indexOfChar('c'));
		System.out.println("Uppercase is : "+d.toUppercase(str1));

	}

}
