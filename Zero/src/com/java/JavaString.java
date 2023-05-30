package com.java;

public class JavaString {

	static void display() {

		StringBuilder sb = new StringBuilder();
		for (char i = 'A'; i <= 'Z'; i++) {

			sb.append(i);
		}

		System.out.println(sb);
	}

	public static void main(String[] args) {

		display();

		String s = "alpha";

		System.out.println(s.indexOf('a', 4));
		System.out.println(s.indexOf("al"));

		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(s.indexOf('p')));
		System.out.println(s.subSequence(2, 3));

		// Removing White spaces
		System.out.println("abc".strip());
		System.out.println("\t a b c\n".strip());

		// Method Chaining
		String result = "AniMaL ".trim().toLowerCase().replace('a', ' ');
		System.out.println(result);

		// Working withIndentation
		var block = "";
		System.out.println(block);
		var concat = " a\n " + "b\n" + " c";
		System.out.println(concat);
		System.out.println(block.length());
		System.out.println(concat.length());

	//	System.out.println(block.indent(1).length());
	//	System.out.println(concat.indent(-1).length());
	//	System.out.println(concat.indent(-4).length());
	//	System.out.println(concat.stripIndent().length());

		// Translating white spaces
		var st = "1\\t2";
		System.out.println(st);
//		System.out.println(st.translateEscapes());

		// Formatting values(%s String, %d int, %f float, %n lineBreak)
		var name = "Kate";
		var id = 5;
		System.out.println(name);
		System.out.println(id);

		System.out.println(String.format("Hello %s,order %d is ready", name, id));
	//	System.out.println("Hello %s,order %d is ready".formatted(name, id));

	}
}
