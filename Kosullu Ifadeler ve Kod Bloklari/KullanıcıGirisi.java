package patikdevOdevler2;
import java.util.*;
public class KullanıcıGirisi {

	public static void main(String[] args) {

		String password, username;
		int choice;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the user name:");
		username = input.next();
		System.out.print("Please enter the password:");
		password = input.next();
		
		
		if(username.equals("userName"))
		{
			if(password.equals("passWord123"))
			{
				System.out.println("Successfull.");
			}
			else
			{
				System.out.println("Password is wrong, to change your password press 1, to try again press 2.");
				choice = input.nextInt() ;
				switch(choice) {
				case 1:
					String confirmPassword, newPassword;
					System.out.print("New password:");
					newPassword=input.next();
					/*
					 * System.out.print("Confirm password:"); confirmPassword=input.next();
					 */
					if(newPassword.equals(password)|| newPassword.equals("passWord123"))
					{
						System.out.println("The password can not be the same as the last one.");
						break;
					}
					/*
					 * else if(newPassword!=confirmPassword) {
					 * System.out.println("Passwords didn't match."); break; }
					 */
					else
					{
						password=newPassword;
						System.out.println("Password changed successfully.");
						break;
					}
					
				case 2:
					System.out.println("Try again later.");
					break;
				}
			}
		}
		else 
		{
			System.out.println("User name is wrong.");
		}
	}

}
