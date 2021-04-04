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

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
            for (int i = 1; scan.hasNext() == true ; i++){
                System.out.println(i + " " + scan.nextLine());
            }
                
            
    }
}

import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
    String s = String.valueOf(n);
   //Write your code here

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}

import java.util.*;
public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		System.out.println("Give me two values and i will find the sum b/w them (1 to 9) : ");
		int a = np.nextInt();
		int b = np.nextInt();
		System.out.println(sum1(a,b));
		System.out.println(fact(a));
	}
	public static int sum1(int a , int b) {
		int sumx  = 0; 
		for(int i = a; i <= b; i++) {
			sumx = sumx + i;
		
		}
		System.out.print("The sum of values b/w them is : ");
		return sumx;
	}
	

import java.util.*;
public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		System.out.println("Give me two values and i will find the sum b/w them (1 to 9) : ");
		int a = np.nextInt();
		int b = np.nextInt();
		System.out.println(sum1(a,b));
		System.out.println(fact(a));
	}
	public static int sum1(int a , int b) {
		int sumx  = 0; 
		for(int i = a; i <= b; i++) {
			sumx = sumx + i;
		
		}
		System.out.print("The sum of values b/w them is : ");
		return sumx;
	}
	
	public static String fact(int a) {
		switch (a) {
			case 1: System.out.println("one is 1st in number line");
			break;
			case 2: System.out.println("two is 2nd in number line");
			break;
			case 3: System.out.println("three is 3rd in number line");
			break;
			case 4: System.out.println("four is 4th in number line");
			break;
			case 5: System.out.println("five is 5th in number line");
			break;
			case 6: System.out.println("six is 6th in number line");
			break;
			case 7: System.out.println("seven is 7th in number line");
			break;
			case 8: System.out.println("eight is 8th in number line");
			break;
			case 9: System.out.println("nine is 9th in number line");
			break;
		}
		return "Thank You ;) ";
		
		
	}
}
