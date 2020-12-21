import java.util.Scanner;


public class Problem2 {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		permutation(s1);
	}
	
	public static void permutation(String input){ 
		permutation("", input); 
	}
	
	public static void permutation(String perm, String word) { 
		if (word.isEmpty()) 
		{ 
			System.out.println("Your String is Empty please try again");
		} 
		else { 
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
			} 
		} 
	}
	
}
