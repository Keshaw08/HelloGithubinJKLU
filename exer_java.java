/* Election */
import java.util.*;
public class election{
	public static void main(String arg[])
	{
		Scanner ea = new Scanner(System.in);
		System.out.println("Please Enter your Age : ");
		int age = ea.nextInt();

		if(age >= 18){
			System.out.println("You are eligible, do you have voter ID card ?");
			Scanner ev = new Scanner(System.in);
			System.out.println("Yes/No == 1/0 : ");
			int ans = ev.nextInt();
			if(ans == 1){
				System.out.println("Okay, Give your valuabe vote to someone who truly Deserves");
			}
			else{
				System.out.println("Sorry, You have to make your Voter ID card");
			}
		}
		else{
			System.out.println("Sorry, You are too small to be eligible for voting");
		}	
	}
}
