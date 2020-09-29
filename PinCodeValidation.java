/* Welcome to the PIN Code Validation Problem */

import java.util.regex.*;
import java.util.*;

public class PinCodeValidation {
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void ValidatePinUC1(String pinCode) {
		
		boolean matcher = pinCode.matches("[\\d ]{6}");
		
		if(matcher == true) {
			System.out.println("Valid PIN Code");
		}else {
			System.out.println("Invalid PIN Code");
		}
	}
	
	public static void ValidatePinUC2(String pinCode) {
		
		boolean matcher = pinCode.matches("^[\\d ]{6}");
		
		if(matcher == true) {
			System.out.println("Valid PIN Code");
		}else {
			System.out.println("Invalid PIN Code");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Pin Code Validation Problem");
		System.out.println("Enter the Pin Code to be Validated");
		String pinCode = sc.nextLine();
		ValidatePinUC2(pinCode);

	}
}
