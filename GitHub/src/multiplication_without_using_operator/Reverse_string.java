package multiplication_without_using_operator;



public class Reverse_string

{
	public static void main(String[] args) {

		String Org = "abcd";
		String Rev = "";
		System.out.println(Org.length());
		System.out.println("+++++++++++++");
		for (int i = Org.length() - 1; i >= 0; i--) {
			Rev = Rev + Org.charAt(i);
		}
		System.out.println(Rev);

		if (Org == Rev) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome ");
		}
	}
}