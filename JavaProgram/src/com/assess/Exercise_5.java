package com.assess;
// Counting Vowels and Consonants
public class Exercise_5 {

	static void findVowels() {
		String str = "tentacle";
		boolean flag=false;
		int vowel=0,consonant=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				flag=true;
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') { 			
				flag=true;
			}
			else
				flag=false;
		if(flag==true)
			vowel++;
		else
			consonant++;
		}
		System.out.println("Vowels = "+vowel);
		System.out.println("Consonants = "+consonant);
	}
	
	public static void main(String[] args) {
		
		findVowels();
	}	
}
