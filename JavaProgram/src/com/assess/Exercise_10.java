package com.assess;

// Generating all permutations
public class Exercise_10 {

	static void permute(char ch[], int l, int r) {
		if (l == r) {
			System.out.println(new String(ch));
		} else {
			for (int i = l; i <= r; i++) {
				swap(ch, l, i);
				permute(ch, l + 1, r);
				swap(ch, l, i);
			}
		}
	}

	static void swap(char ch[], int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	public static void main(String[] args) {

		String str = "123";
		permute(str.toCharArray(), 0, str.length() - 1);

	}
}
