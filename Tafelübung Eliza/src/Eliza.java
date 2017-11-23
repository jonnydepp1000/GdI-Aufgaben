import gdi.util.eliza.ElizaEnglish;

public class Eliza {
	public static void main(String[] args) {
		
		System.out.println(ElizaEnglish.greetings());
		System.out.println(ElizaEnglish.tell("What is your name?"));
		System.out.println(ElizaEnglish.tell("Whom do you like?"));
		System.out.print(ElizaEnglish.goodbye());



	}
}
