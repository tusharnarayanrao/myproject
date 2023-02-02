package multiplication_without_using_operator;

public class vowels {
	public static void main(String[] args) {

		String word = "Ruturaj Patil";

		int numbersofvowels = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E'
					|| ch == 'O' || ch == 'U') {
				numbersofvowels++;
				System.out.println(ch);
			}

		}
		System.out.println(numbersofvowels);

	}

}
