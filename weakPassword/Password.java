import java.util.Scanner;

public class Password {
	
	static Scanner in = new Scanner(System.in);
	private static boolean DigitCheck = false;
	private static boolean lengthCheck = false;
	private static  String Pass;
		
	public static String getPass() {
		return Pass;
	}
			
	
	static  void validPass(String pass) throws WeakPasswordException  {
		 
		do {
			try {
				System.out.println("Enter your Password:");
				String getPass = in.next();
				length(getPass);
				
			}catch(WeakPasswordException e) {
				System.out.println(e);
			}
			
		}while (!DigitCheck ||  !lengthCheck);
	}
	
	  
		public  static boolean length(String pass) throws WeakPasswordException  {
			int numbers = 0;
				
			for (char a : pass.toCharArray()) {			
				if (Character.isDigit(a)) {
					numbers++;
				}			
			}
			
			if(pass.length() == 10) {
				lengthCheck = true;
			}
			
			if(numbers == 2) {
				DigitCheck = true;
			}
			
			if (!lengthCheck) {
				throw new WeakPasswordException("Password most be 10 Character");
			}
			if (!DigitCheck) {
				throw new WeakPasswordException("PassWord must include 2 Numbers");
			}
			
			System.out.println("Your Password is valid: " + pass );
				return true;	
		}
}