/*
 * Accept the character to find out whether the given character is a 
 * digit or a character or a special symbol
 */

public class FindSpecialCharacters 
{
	char ch;
	

	public FindSpecialCharacters(char ch) {
		super();
		this.ch = ch;
	}
	public String validateCharacter() {
//		int no = (int)(ch);
//		System.out.println(no);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			return "It is a Character";
		else if(Character.isDigit(ch))
			return "It is a Digit";
		else
			return "It is a Special Symbol";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindSpecialCharacters  a = new FindSpecialCharacters ('A');
		System.out.println(a.validateCharacter());

	}

}
