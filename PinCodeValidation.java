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

	public static void ValidatePinUC3(String pinCode) {

		boolean matcher = pinCode.matches("^[\\d ]{6}$");

		if(matcher == true) {
			System.out.println("Valid PIN Code");
		}else {
			System.out.println("Invalid PIN Code");
		}

	}

	public static void ValidatePinUC4(String pinCode) {

		boolean matcher = pinCode.matches("^[0-9]{3}?(\s)[0-9]{3}$");
		
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
		ValidatePinUC4(pinCode);

	}

}
