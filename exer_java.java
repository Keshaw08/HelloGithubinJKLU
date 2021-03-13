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

import java.util.*;
public class leapyear{
	public static void main(String arg[])
	{
		Scanner lp = new Scanner(System.in);
		System.out.println("Please Enter the year : ");
		int l_year = lp.nextInt();
		if (l_year%4==0){
			if(l_year%100==0){
				if(l_year%400==0){
					System.out.println(l_year + " : is a leap year");
				}
				else{
					System.out.println(l_year + " : is not a leap year");
				}
			}
			else{
				System.out.println(l_year + " : is a leap year");
			}
		}
		else{
			System.out.println(l_year + " : is not a leap year");
		}
	}
}


/* Restourent Thali */

import java.util.*;
public class rst_mnu{
	public static void main (String arg[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Please tell me you Budget : ");
		int price = pp.nextInt();
		if (price >= 50){
			switch(price){
				case 50:
					System.out.println("The Basic Thali");
					break;
				case 150:
					System.out.println("The silver Thali");
					break;
				case 250:
					System.out.println("The Premium Thali");
					break;
				case 400:
					System.out.println("The Royal Thali");
					break;
				case 550:
					System.out.println("The Royal Rajwadi Thali (out best yet)");
					break;
				default:
					System.out.println("you have our daal baati");
			}	

		}
		else{
			System.out.println("our Hotel Menu Start from 50 ");
		}
}

?/* Nothing */

}import java.util.*;
public class nothing{
	public static void main(String arg[]){
		Scanner nt = new Scanner(System.in);
		System.out.println("Enter nothing to continue : ");
		String not = nt.nextLine();
		if (not == " "){
			System.out.println("You got Nothing");
		}
	}

}