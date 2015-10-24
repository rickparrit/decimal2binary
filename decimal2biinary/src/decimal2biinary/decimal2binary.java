package decimal2biinary;
import java.util.Scanner;
public class decimal2binary {

	public static void main(String[] args) {
	int decimal;
	int remainder;
	System.out.println("Insert decimal number");
		Scanner user_input = new Scanner(System.in);
		 
		decimal = user_input.nextInt();
			StringBuilder result = new StringBuilder();
			while (decimal != 0) {
			    remainder = decimal % 2; 
			    decimal = decimal / 2;
			    result.append(remainder);
			}
			System.out.println (result.reverse().toString());
	        
        } 
    }
		