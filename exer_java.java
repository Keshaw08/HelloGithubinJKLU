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

import java.util.Scanner;

class Complex{
	int c1_r,c2_r,c1_i,c2_i;
	public int add_real(){
		return c1_r + c2_r;
	}
	public int add_img() {
		return c1_i + c2_i;
	}
	
}

public class MyComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex aCom = new Complex();
		Scanner ns = new Scanner(System.in);
		System.out.println("Tell me number real part of c1 : ");
		aCom.c1_r = ns.nextInt();
		System.out.println("Tell me number real part of c2 : ");
		aCom.c2_r = ns.nextInt();
		System.out.println("Tell me number img part of c2 : ");
		aCom.c1_i = ns.nextInt();
		System.out.println("Tell me number img part of c2 : ");
		aCom.c2_i = ns.nextInt();
		
		System.out.println("The sum of complex number is : "+ aCom.add_real() + " + "+aCom.add_img() + "i");
	}

}

import java.util.*;
import java.math.BigInteger;
public class BigInt{
	public static void main(String args[]){
		Scanner ns = new Scanner(System.in);
		System.out.println("give me two numbers : 
        	BigInteger a = ns.nextBigInteger();
        	BigInteger b = ns.nextBigInteger();
        	System.out.println(a.add(b));
        	System.out.println(a.multiply(b));	
	}
}


Scanner nw = new Scanner(System.in);
		System.out.println("give a number and n : ");
		int a = nw.nextInt();
		int b = nw.nextInt();
		int c = 0;
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		int arr4[] = {2,3,1,7,8,4,6,2,3};
		for(int t=0; t<arr4.length;t++) {
		if(arr4[t] < 5) {
		System.out.println(arr4[t]);
			}
		}

String arr3[] = {"lakshit ", "pari"};
		for(int j =0 ; j<arr3.length;j++) {
			System.out.println(j + " : "+ arr3[j]);
		}


int arr1[] = new int [5];
		String arr2[] = new String[5];
		for (int i=0; i<arr1.length; i++) {
			arr2[2] = "Hello";
			arr1[1] = 23;
			System.out.println(i + " : " + arr1[i]);
			System.out.println(i + " : " + arr2[i]);
			System.out.println(arr1[i] + " : "+ arr2[i]);
		}
		

public class findname{
	Static void main (String args[]){
		Scanner nm = new Scanner(System.in);
	        String a = nm.next();
	        
	        if(a.charAt(0) == 'A' || a.charAt(0) == 'Y' || a.charAt(0) == 'D' || a.charAt(0) == 'F' || a.charAt(0) == 'J' || a.charAt(0) == 'K'){
	            System.out.println(25);
	        }else if (a.charAt(0) == 'H' || a.charAt(0) == 'I' || a.charAt(0) == 'N' || a.charAt(0) == 'P' || a.charAt(0) == 'V'){
	            System.out.println(50);
	        }else{
	            System.out.println(15);
	        }
	}
}

public static int print1_10(int n) {
		if(n==3) {
			return 3;
		}
		System.out.println(print1_10(n-3));
		return n;
	}

public static int print3_8(int b) {
		if (b == 3){
			return 3;
		}
		int ret =  print3_8(b-1);
		System.out.println(ret);
		return b;
	}

public static int print5_50(int a) {
		if(a == 5) {
			return 5;
		}
		int rett = print5_50(a-5);
		System.out.println(rett);
		return a;
	}


int arr1[] = new int[5];
		int arr2[] = new int[6];
		for(int i = 0; i<arr1.length;i++) {
			arr1[i] = i+'@';
			arr2[i] = i+(i*i);
			System.out.println(i+" : "+arr1[i]);
			System.out.println(i+" : "+arr2[i]);
		}


public static int f_table(int n) {
		if(n==80) {
			return 80;
		}
		int ret = f_table(n+8);
		System.out.println(ret);
		return n;
	}


class circle{
	double x,y,r;
	double circum(){
		return 2*3.14*r;
	}
	double area(){
		return 3.14*r*r;
	}
	circle (double x1, double y1, double r1){
		x= x1;
		y= y1;
		r=r1;
	}
	circle (){
		x =0;
		y = 0;
		r = 1;
	}
	circle(double y2, double r2){
		x=5;
		y = y2;
		r = r2;
	}
}

class mycircle{
	public static void main(String args[]){
		circle Acircle;
		circle Bcircle;
		circle Ccircle;
		circle Dcircle;
		Acircle = new circle(10,20,5);
		Bcircle = new circle(20,30,10);
		Ccircle = new circle();
		Dcircle = new circle(15,6);
		System.out.println();
		System.out.println("area : "+Acircle.area());
		System.out.println("circumferrence : " + Acircle.circum());
		System.out.println("area of Bcircle : "+Bcircle.area());
		System.out.println("area of c-circle : "+Ccircle.area());
		System.out.println("area of D-circle : "+Dcircle.area());
	}
}

class mobile{
	int ram, sto, fcam, rcam, price;
	
	mobile(int ram1, int sto1, int fcam1,int rcam1, int price1){
		ram = ram1;
		sto = sto1;
		fcam = fcam1;
		rcam = rcam1;
		price = price1;
	}

	mobile(){
		ram = 2;
		sto = 8;
		fcam = 5;
		rcam = 8;
		price = 5000;
	}

	mobile(int ram2 , int price2){
		ram = ram2;
		sto = 8;
		fcam= 5;
		rcam = 8;
		price = price2;
	}

	mobile(int ram3, int sto3, int price3){
		ram = ram3;
		sto = sto3;
		fcam = 5;
		rcam = 8;
		price = price3;
	}
	
	mobile(int ram4 , int sto4 , int rcam4, int price4){
		ram = ram4;
		sto = sto4;
		fcam = 5;
		rcam = rcam4;
		price = price4;
	}

}

class myphone{
	public static void main(String args[]){
	
	mobile samsung;
	mobile nokia;
	mobile htc;
	mobile moto;
	mobile iphone;

	samsung = new mobile(4,16,5,12,12000);
	nokia = new mobile();
	htc = new mobile(4, 7000);
	moto = new mobile(5, 16, 9000);
	iphone = new mobile(6,32,16,13000);

	if(samsung.rcam > nokia.rcam){
		int best;
		best =  samsung.rcam;
		System.out.println("The best Front camera is of samsung(mp) : " +samsung.fcam);
		System.out.println("Storage of Samsung(gb) : "+ samsung.sto);
		System.out.println("Rear camera of Samsung(mp) : " +samsung.rcam);
		System.out.println("Price of Samsung(rs) : "+samsung.price);
		System.out.println("Ram of Samsung(gb) : "+samsung.ram);
	}
	
	System.out.println();
	System.out.println("samsung price : " + samsung.price);
	System.out.println("nokia Price : "+nokia.price);
	System.out.println("htc price : "+htc.price);
	System.out.println("moto price : "+moto.price);
	System.out.println("iphone price : "+iphone.price);
	}
}


import java.util.*;

class subject{
	String nm, batch;
	int roll;
	double mathnum, phynum, chemnum;
	
	double add(){
		double sum = mathnum + phynum + chemnum;
		System.out.println("Total : "+sum+"/300");
		return sum/300;
	}
	
	subject(String nm1 , String batch1){
		nm = nm1;
		batch = batch1;
		mathnum = 33;
		phynum = 33;
		chemnum = 33;
	}
	subject(String nm1 , int roll1, double math1 , double phy1 , double chem1){
		nm = nm1;
		roll = roll1;
		mathnum = math1;
		phynum = phy1;
		chemnum = chem1;
	}
	subject(String nm1 , int roll1, double math2 , double phy2){
		nm = nm1;
		roll = roll1;
		mathnum = math2;
		phynum = phy2;
		chemnum = 33;
	}
	subject(String nm1, int roll1, double math3){
		nm = nm1;
		roll = roll1;
		mathnum = math3;
	}
	subject(String nm1, int roll1, String bt, double math4, double phy4, double chem4){
		nm = nm1;
		roll = roll1;
		batch = bt;
		mathnum = math4;
		phynum = phy4;
		chemnum = chem4;
	}
	
}

public class students {

	Scanner np = new Scanner(System.in);
		System.out.println("What is Name of Student : ");
		String a = np.next();
		System.out.println("Roll no. of Student : ");
		int b = np.nextInt();
		System.out.println("Batch of Student : ");
		String bt = np.next();
		System.out.println("Marks of Mathematics : ");
		double mt = np.nextDouble();
		System.out.println("Marks of Physics : ");
		double ph = np.nextDouble();
		System.out.println("Marks of Chemistry : ");
		double ch = np.nextDouble();
		
		subject Asubject;
		Asubject = new subject(a,b);
		Asubject= new subject(a,b,mt,ph,ch);
		
		System.out.println("==========Score Card==========");
		System.out.println();
		System.out.println("Mathematics : "+ Asubject.mathnum);
		System.out.println("Physics : "+ Asubject.phynum);
		System.out.println("Chemistry : "+ Asubject.chemnum);
		System.out.println();
		System.out.println("Percantage : "+ Asubject.add()*100 + "%");
		System.out.println();
		System.out.println("==============================");
}


public static String dream11(String n) {
		if(n == "csk") {
			return "MS dhoni";
		}
		else if (n == "mi") {
			return "rohit";
		}
		return "draw";
	}



import java.util.*;
public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO ELECTION POLING BOOTH");
		Scanner np = new Scanner(System.in);
		System.out.println("What is your age : ");
		int a = np.nextInt();
		String arr1[] = {"Narendra Modi","Rahul Gandhi","Arvind Kejriwal"};
		String arr2[] = {"John", "Goku","Thor",""};
		
		if(a < 18) {
			System.out.println("Sorry my Friend, you are not Eligible.");
		}else {
			System.out.println("Okay you are eligible, do you have voter ID card? (Y/N) ");
			String b = np.next();
			
			if(b.equals("Y")) {
				System.out.println("Okay your voter ID card is in good condition.");
				System.out.println("Below is the list of Candidate, whom do you want to Select.");
				System.out.println();
				for(int i=0; i<arr1.length;i++) {
					System.out.println(arr1[i]);
				}
				System.out.println();
				String c = np.next();
				System.out.println();
				System.out.println("Good you have made a good decision may your candidate win.");
			}
			else {
				System.out.println("NO Problem, let's add your name to voter ID list");
				String d = np.next();
				System.out.println();
				for(int j=0; j<arr2.length;j++) {
					arr2[arr2.length-1] = d;
					System.out.println(arr2[j]);
				}
			}
		}
	}

}


import java.util.Scanner;

public class Practice_vacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value = 127;
		value++;
		System.out.println(value);
		
		byte value2 = 127;
		value2--;
		System.out.println(value2);
	}

}


public class MyArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guess("Hello"));
		System.out.println("Binary value is : "+fun(5));
		System.out.println("binary : "+fun(348709174));
	}
	public static int guess(String n) {
		if (n.equals("Hello")) {
			System.out.println("Yes code is correct");
		}
		return n.length();
	}
	
	public static String fun(int a) {
		return Integer.toBinaryString(a);
	}
	
}


int a,b,sum=0;
		Scanner np = new Scanner(System.in);
		System.out.println("Give me a Number : ");
		a = np.nextInt();
		
		while(a>0) {
			b = a%10;
			sum = sum + b;
			a = a/10;
		}
		System.out.println("The sum of digits is : "+sum);



		System.out.println("Tell me a number to find table : ");
		int d = np.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(d + " X "+i+" = "+d*i);
		}



class models{
	int Eng,gear,seat;
	
	int price() {
		int arr1[] = {Eng, gear,seat};
		for(int i = 0; i<3;i++) {
			System.out.println(arr1[i]);
		}
		return Eng*5 + gear*10 + seat*2;
	}

	models(int e1, int g1, int s1){
		Eng = e1;
		gear = g1;
		seat = s1;
	}
	models(int e2){
		Eng = e2;
		gear = 5;
		seat = 4;
	}
}


public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		models Honda;
		models Skoda;
		Honda = new models(1300,6,7);
		Skoda = new models(1275);
		System.out.println("Price of Honda (100$) : "+Honda.price());
		System.out.println();
		System.out.println("Price of Skoda (100$) : "+Skoda.price());
	}

}


for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("*");
				if(i==2 && j == 1) {
					System.out.print("#");
				}
				if(i==4 && j == 3) {
					System.out.print("@");
				}
			}
			System.out.println();
		}

class same_fun{
	int pick_odd_out(int a, int b) {
		if(a%2==0) {
			return b;
		}
		else {
			return a;
		}
	}
	
	String pick_odd_out(String c, String d) {
		if(c.length()%2==0) {
			return d;
		}
		else {
			return c;
		}
	}
	
	char pick_odd_out(char e, char f) {
		if(e%2==0) {
			return f;
		}
		else {
			return e;
		}
	}
	
	double pick_odd_out(double g, double h) {
		if(g%2==0) {
			return h;
		}
		else {
			return g;
		}
	}
}
public class Same_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		same_fun ak = new same_fun();
		System.out.println("The odd number is : "+ak.pick_odd_out(5,4));
		System.out.println();
		System.out.println("The word with odd number length : "+ak.pick_odd_out("khalifa", "burj khalifa"));
		System.out.println();
		System.out.println("The char with odd ascii number is : "+ak.pick_odd_out('#','~'));
		System.out.println();
		System.out.println("The double with odd number is : "+ ak.pick_odd_out(2.7, 0.6));
		System.out.println();


String max(String ck, String dk, String ek) {
		if(ck.compareTo(dk)>0 && ck.compareTo(ek)>0) {
			return ck;
		}
		else if(dk.compareTo(ck)>0 && dk.compareTo(ek)>0) {
			return dk;
		}
		else {
			return ek;
		}
	}
max_fun c = new max_fun();
System.out.println(c.max("computer", "super computer"));


class max_fun{
	int max(int a, int b, int y) {
		if(a > b && a > y) {
			return a;
		}
		else if(b > a && b > y) {
			return b;
		}
		else {
			return y;
		}
		
	}
	
	int max(int ar, int br) {
		if(ar > br) {
			return ar;
		}
		else {
			return br;
		}
	}
	
	double max(double d, double e) {
		if(d>e) {
			return d;
		}
		else {
			return e;
		}
	}
	
	String max(String ak, String bk) {
		if(ak.compareTo(bk)>0) {
			return ak;
		}
		else {
			return bk;
		}
	}
	
	char max(char at, char bt) {
		if(at > bt) {
			return at;
		}
		else {
			return bt;
		}
	}
	

}


public class method_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_fun c = new max_fun();
		
		
		System.out.println(c.max(4,7,16));
		
		System.out.println(c.max(3.4f,4.5f));
		
		System.out.println(c.max("Hello","Fellow"));
		
		System.out.println();
		
		System.out.println(c.max('#','@'));
		
		System.out.println(c.max(5,3));
		
		System.out.println(c.max("KFC", "McDonalds", "Burger King"));
		
		System.out.println(0011);
	}

	

}

for(int k=0;k<9;k++) {
			for(int l=0;l<9;l++) {
				System.out.print("$");
				if(k%2==0 && l%3==0) {
					System.out.print("@");
					System.out.print("~");
				}
			}
			System.out.println();
		}


for(int t=0;t<8;t++) {
			for(int y=0;y<5;y++) {
				int j=0;
				do {
					System.out.print("~");
					System.out.print("!");
					j++;
				}while(j<1);
			}
			System.out.println();
		}


import java.util.*;
class sam_fun{
	boolean same(int a, int b) {
		boolean c = (a + b)%2==0;
		return c;
	}
	
	int same(String d, String e) {
		int f = (d.length() + e.length());
		return f;
	}
	
	boolean same(char f, char t, char w) {
		boolean u = (f + t)%w==0;
		return u;
	}
}


sam_fun ak = new sam_fun();
		
		System.out.println(ak.same("HelloHarryPotter", "IAmIronMan"));
		System.out.println();
		System.out.println(ak.same(66, 99));
		System.out.println();
		
		Scanner np = new Scanner(System.in);
		System.out.println("Give me Two Numbers for the Field which will be checked for division by 2 : ");
		int bk = np.nextInt();
		int ck = np.nextInt();
		
		System.out.println();


for(int h=0;h<bk;h++) {
			for(int g=0;g<ck;g++) {
				if(ak.same(bk, ck)==true) {
					System.out.print("^");
					if(h==2 && g==3) {
						System.out.print("#");
					}
				}
				else {
					System.out.print("!");
					
				}
			}
			System.out.println();
		}


		System.out.println();
		
		for(int h=0;h<bk;h++) {
			for(int g=0;g<ck;g++) {
				if(ak.same('#','-','&')==true) {
					System.out.print("_");
					if(h==2 && g==3) {
						System.out.print("-");
					}
				}
				else {
					System.out.print("`");
					if(h==2 && g==3) {
						System.out.print("=");
					}
				}
			}
			System.out.println();
		}
		
	}
	
}


import java.util.*;
public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		System.out.println("Give me all the Name of the Problem you have thaught : ");
		
		String arr1 [] = new String[10];
		
		for(int i=0;i<10;i++) {
			arr1[i] = np.next();
		}
		
		System.out.println();
		
		for(int j=0;j<10;j++) {
			System.out.println(arr1[j]);
		}
	}

}

class Chips{
	String Brand;
	int Price;
	static int Total_Price;
	String Type;
	
	Chips(String Brand, int Price, String Type){
		this.Brand = Brand;
		this.Price = Price;
		this.Type = Type;
		Total_Price = Total_Price + Price;
	}
	
}
public class Chips_Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chips c1 = new Chips("Lays",20,"Cream&Onion");
		Chips c2 = new Chips("Diamond",10,"Tomato");
		Chips c3 = new Chips("Dorito's",35,"Nachos");
		Chips c4 = new Chips("Sizzling_Barbeque",40,"Chilli_Potato");
		
		System.out.println(c1.Total_Price);
	}

}

class Biscuit{
	String Brand;
	int Pieces;
	static int Total_Weight = 0;
	double Weight;
	int Price;
	
	Biscuit(String Brand, int Pieces, int Price,int Weight){
		this.Brand = Brand;
		this.Pieces = Pieces;
		this.Price = Price;
		this.Weight = Weight;
		Total_Weight = Total_Weight + Weight;
	}
}


public class Biscuit_Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biscuit B1 = new Biscuit("Jim-Jam",6,30,50);
		Biscuit B2 = new Biscuit("Oreo",8,30,60);
		Biscuit B3 = new Biscuit("Dark Fantasy",5,30,50);
		Biscuit B4 = new Biscuit("Parle G",10,5,80);
		
		System.out.println(B1.Total_Weight);
	}

}

for(int q=0;q<8;q++) {
			for(int w=0;w<9;w++) {
				if((q+w)%2==0) {
					System.out.print("[;]");
				}
				else {
					System.out.print("/-/");
				}
				
			}
			System.out.println();
		}


for(int j=0;j<10;j++) {
			System.out.println(arr1[j]);
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				switch (i+j) {
				case (2) : System.out.print("!");
				break;
				
				case(4) : System.out.print("`");
				break;
				
				case(6) : System.out.print("?");
				break;
				
				case(8) : System.out.print("[]");
				break;
				
				default : System.out.print("_");
				}
			}
			System.out.println();
		}



public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.print("~");
			for(int j=0;j<6;j++) {
				System.out.print("!");
				for(int k=0;k<6;k++) {
					System.out.print("{}");
					for(int l=0;l<6;l++) {
						System.out.print("+");
						
						
					}
				}
			}
			System.out.println();
		}

		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				switch (i+j) {
				case (3) : System.out.print("~");
				break;
				
				case (6) : System.out.print("_");
				break;
				
				case (9) : System.out.print("\\");
				break;
				
				case (12) : System.out.print(">");
				break;
				
				case (15) : System.out.print("||");
				break;
				
				case (18) : System.out.print(":");
				break;
				
				default : System.out.print("-");
				}
			}

		for(int i=10;i>0;i--) {
			for(int j=0;j<10;j++) {
				if(i+j==2 || i+j==4 || i+j==6 || i+j==8 || i+j==10) {
					System.out.print("^");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}


for(int i=10;i>0;i--) {
			for(int j=0;j<10;j++) {
				if(i+j==2 || i+j==4 || i+j==6 || i+j==8 || i+j==10) {
					System.out.print("^");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print("Q");
				System.out.print("W");
				
				if((i+j)%4==0) {
					System.out.print("[]");
				}
				
				if((i+j)%8==0) {
					System.out.print("--");
				}
			}
			System.out.println();
		}


String arr1 [] = {"Hello", "Github", "in","JKLU"};
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
			System.out.print("->s");
			for(int j=0;j<arr1[i].length();j++) {
				System.out.print("*");
			}
			System.out.println();
		}

System.out.println();
		
		int a1 = 2;
		int b1 = 3;
		int c=0;
		for(int i=1;i<=a1;i++) {
			c = c + b1;
			System.out.println(c);
		}

System.out.println();
		
		char field[][] = new char[8][8];
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0 && j%2==0 && i%3==0 && j%3==0) {
					field[i][j] = '*';
					System.out.print(field[i][j]+" ");
				}
				else if(i%2==1 && j%2==1) {
					field[i][j] = '#';
					System.out.print(field[i][j] + " ");
				}
				else {
					field[i][j] = '^';
					System.out.print(field[i][j] + " ");
				}
				
			}
			System.out.println();
		}

System.out.println("Let's Start From the Starting.");
		
		int a = 23;
		String b = "Hello";
		char c = '#';
		double d = 34.4;
		float e = 4.5f;
		boolean f = true;
		long g = new Long(100000);
		
		System.out.println();
		System.out.println("int : "+a +"\n"+ "String : "+b+ "\n" +"char : "+c+"\n"+"double : "+d + "\n"+ "Float : "+e+"\n"+"boolean : "+f+"\n"+"Long : "+g);
		System.out.println();
		
		System.out.println("Multiply : "+a*d);
		System.out.println("Divide : "+ g/e);
		

System.out.println();
		System.out.println("The Conditional Statements :");
		System.out.println();
		
		Scanner np = new Scanner(System.in);
		System.out.println("Give me an Int and a String ");
		int h = np.nextInt();
		String i = np.next();
		
		if(h< 45 && h>20) {
			System.out.println("Yes a int is in range Specified.");
		}
		else if(i.equals("Hello") || i.charAt(0)=='N') {
			System.out.println("Yes b String is in range Specified.");
		}
		else {
			System.out.println("Alas, Both the variable are out of Range.");
		}
		

System.out.println();
		System.out.println("Give me a float value");
		int j = (int) np.nextDouble();
		
		switch (j%3) {
		case (0) : System.out.println("The float value divided by 3 gives 0, Hence it is a Factor of 3.");
		break;
		
		case (1) : System.out.println("The float value divided by 3 gives 1.");
		break;
		
		case (2) : System.out.println("The float value divided by 3 gives 2.");
		break;
		
		default : System.out.println("The float value is not Divisible by 3.");
		}
		System.out.println();

System.out.println((j<5.0)?"float is less than 5":"float is greater than 5");
		System.out.println();
		System.out.println((j%2==0)?"float is divisible by 2":"float is not divisible by 2");
		System.out.println();
		

System.out.println("The Loops : ");
		
		System.out.println("The While Loop");
		int ak=0;
		while (ak<4) {
			j = j+1;
			System.out.println(j);
			ak++;
		}

System.out.println();
		System.out.println("The Do-While Loop");
		
		int bk=0;
		do {
			j = j-1;
			System.out.println(j);
			bk++;
		}while(bk<6);
		
		System.out.println();
		System.out.println("The For Loop");
		
		for(int k=0;k<8;k++) {
			j = j + k;
			System.out.println(j);
		}

System.out.println("The Arrays");
		
		int arr1 [] = new int [5];
		for(int ck=0; ck<arr1.length;ck++) {
			arr1[ck] = (int) Math.pow(ck, j);
			System.out.println(arr1[ck]);
		}
		
		System.out.println();

char arr2 [][] = new char [6][8];
		
		for(int dk = 0;dk<6;dk++) {
			for(int ek = 0;ek<8;ek++) {
				if((dk + ek)%2==0) {
					arr2[dk][ek] = '&';
				}
				else if ((dk + ek)%2==1){
					arr2[dk][ek] = '@';
				}
				else {
					arr2[dk][ek] = '#';
				}
			}
		}

for(int i1=0;i1<6;i1++) {
			for(int j1=0;j1<8;j1++) {
				System.out.print(arr2[i1][j1] + " ");
			}
			System.out.println();
		}
		
		String arr3[] = {"John Wick","Jason Borne","Zeus","Bane"};
		System.out.println();
		
		for(int i2 = 0;i2<arr3.length;i2++) {
			arr3[i2] += " ^/ Tick";
			System.out.println(arr3[i2]);
		}

String arr4[][] = {{"Jeff Bezos", "Elon Musk"},{"Bernard", "Bill Gates"},{"Ambani","Adani"}};
		System.out.println();
		
		for(int i3=0;i3<arr4.length;i3++) {
			for(int i4 = 0;i4<2;i4++) {
				arr4[i3][i4] += " ^/ Business Owner";

			}
		}
		
		for(int i5=0;i5<arr4.length;i5++) {
			for(int i6=0;i6<2;i6++) {
				System.out.print(arr4[i5][i6]+ " ");
			}
			System.out.println();
		}


System.out.println("The Strings ");
		
		String fk = new String("Let's kill him properly this time.");
		System.out.println(fk.length() +" "+ fk.charAt(6));

String gk = "You can take my toys but one thing you can't take away from me that is I am Iron Man.";
		
		System.out.println(gk.subSequence(13, 20));
		System.out.println(gk.toUpperCase() + "\n" + gk.toLowerCase());
		
		if(gk.substring(3,4).equals('H')) {
			System.out.println(gk.compareTo(fk)<0);
		}

public static int Vovel_word(String gk) {
		int count=0;
		for(int i=0;i<gk.length();i++) {
			if(gk.charAt(i)=='a' || gk.charAt(i)=='e' || gk.charAt(i)=='i' || gk.charAt(i)=='o' || gk.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
System.out.println("The no. of Vowels in gk String are : "+Vovel_word(gk));

System.out.println(Math.sin(30) + Math.cos(60));
		
		System.out.println(Math.log(40) + Math.E  + Math.pow(3,2));
		
		System.out.println("2.6 : " + Math.ceil(2.6) + " " + "3.3 : "+Math.floor(3.3));
		System.out.println("round with rint 2.6 : " + Math.rint(2.6) + " " + "round with round 3.3 : "+Math.round(3.3));


System.out.println();
		int jk = (int) (Math.random()*1000);
		System.out.println(jk);

int wk = (int)((int)'a' + Math.random()*((int)'z' - (int)'a' + 1));
		System.out.println(wk);
		
		char sk = (char)('a' + Math.random()*('z' - 'a' + 1));
		System.out.println(sk);

class laptop{
	int ram,rom;
	String brand,processor;
	
	String Coding(int ram,int rom,String brand,String processor) {
		if(ram > 8) {
			System.out.println("Yes, With this configuration of ram you can code easily.");
		}
		else if(ram < 8 || processor.equals("i5")) {
			System.out.println("Yes, With this configuration of processor you can code easily.");
		}
		else {
			System.out.println("For best coding experiance you must upgrade.");
		}
	return "remember, Start with what you have.";
	}
}


		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if((i+j)%2==(i-j)%2) {
					System.out.print("^");
				}
				else {
					System.out.print("||");
				}
			}
			System.out.println();
		}

import java.util.*;
class Laptop {
	public int ram,rom;
	public String processor, archi;
	
	public String Coding() {
		if(ram > 6 || archi == "32Bit") {
			System.out.println("Yeah, you can code with this configuration of ram.");
		}
		else if(archi == "64Bit" || processor == "i5"){
			System.out.println("Yeah, you can code with this configuration of processor.");
		}
		else {
			System.out.println("You must upgrade your PC for Coding.");
		}
	
	return "Remember to Start with what you have.";
	}
}

public class Start_Java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner np = new Scanner(System.in);
		System.out.println("Give the Configration for the PC.");
		
		Laptop Apple;
		Apple = new Laptop();
		System.out.println("Give the Ram");
		Apple.ram = np.nextInt();
		System.out.println("Give the Rom");
		Apple.rom = np.nextInt();
		System.out.println("Give the Processor");
		Apple.processor = np.next();
		System.out.println("Give the Architectur");
		Apple.archi = np.next();
		
		System.out.println(Apple.Coding());
		
	}

}

public String Coding() {
		for(int i=0; i<ram;i++) {
			for(int j=0;j<rom/32;j++) {
				if(ram > 6 || archi == "32Bit") {
					//System.out.println("Yeah, you can code with this configuration of ram.");
					System.out.print("^");
				}
				else if(archi == "64Bit" || processor == "i5"){
					//System.out.println("Yeah, you can code with this configuration of processor.");
					System.out.print("%");
				}
				else {
					//System.out.println("You must upgrade your PC for Coding.");
					System.out.print("-");
				}
			}
			System.out.println();
		}

class Maths_Class_6{
	boolean decimal;
	boolean avarage;
}

class Maths_Class_10 extends Maths_Class_6{
	boolean Trignometry;
	boolean Surface_area;
}

class Maths_Class_12 extends Maths_Class_10{
	boolean Vector;
	boolean Calculus;
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths_Class_12 c1 = new Maths_Class_12();
		c1.avarage = true;
		c1.Calculus = false;
		c1.Trignometry = true;
		
		System.out.println("Avarage in 12th : "+c1.avarage + "\n" + "Calculus in 12th : "+c1.Calculus + "\n"+"Trignometry in 12th : "+c1.Trignometry);
		
	}

}

class JKLUStudents{
	String name;
	String Address;
	String mobile;
}

class IETStudents extends JKLUStudents{
	String branch;
	double jeescore;
}

class CSEStudents extends IETStudents{
	boolean pc_at_home;
	boolean cs_in_12th;
}

class JKLU_BCA extends CSEStudents{
	boolean MCA_karnahai;
	
}

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSEStudents s1 = new CSEStudents();
		s1.name = "Bansal";
		s1.Address = "Civil Lines";
		s1.cs_in_12th = true;
		s1.pc_at_home = false;
		s1.jeescore = 94.3;
		System.out.println("Name : "+s1.name + "\n" + "Address : "+s1.Address + "\n"+"CS in 12th : "+s1.cs_in_12th + "\n" + "PC at home : " +s1.pc_at_home + "\n" +"JeeScore : "+s1.jeescore);
		
		System.out.println();
		
		IETStudents s2 = new IETStudents();
		s2.name = "Wadhwa";
		s2.branch = "ME";
		s2.Address = "Mansarovar";
		s2.jeescore = 84.8;
		System.out.println("Name : "+s2.name + "\n"+"Address : "+s2.Address + "\n"+"JeeScore : "+ s2.jeescore + "\n" +"Branch : "+ s2.branch);
		
		System.out.println();
		JKLU_BCA s3 = new JKLU_BCA();
		s3.name = "Damani";
		s3.jeescore = 77.8;
		s3.MCA_karnahai = true;
		System.out.println("Name : "+s3.name + "\n"+"JeeScore : "+s3.jeescore + "\n" + "Do you want to do MCA : "+s3.MCA_karnahai);
	}

}


for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(j==2) {
					System.out.print("^");
				}
				if(j==4) {
					System.out.print("-");
				}
				if(j==6) {
					System.out.print("`");
				}
				if(j==8) {
					System.out.print("~");
				}
				System.out.print(",");
			}
			System.out.println();
		}

for(int i=0; i<8;i++) {
			if(i%2==0) {
				System.out.print("~");
			}
			for(int j=0; j<8; j++) {
				if(j%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(">");
				}
			}
			System.out.println();
		}


import java.util.*;
class Laptop {
	public int ram,rom;
	public String processor, archi;
	
	public String Coding() {
		for(int i=0; i<ram;i++) {
			for(int j=0;j<rom/32;j++) {
				if(ram > 6 || archi == "32Bit") {
					//System.out.println("Yeah, you can code with this configuration of ram.");
					System.out.print("^");
				}
				else if(archi == "64Bit" || processor == "i5"){
					//System.out.println("Yeah, you can code with this configuration of processor.");
					System.out.print("%");
				}
				else {
					//System.out.println("You must upgrade your PC for Coding.");
					System.out.print("-");
				}
			}
			System.out.println();
		}
	
	return "Remember to Start with what you have.";
	}
	
	Laptop(int ram, String processor){
		this.ram = ram;
		this.processor = processor;
		rom = 1024;
		archi = "32Bit";
	}
	
	Laptop(int a1, int b1, String c1, String d1){
		ram = a1;
		rom = b1;
		processor = c1;
		archi = d1;
	}
}

public class Start_Java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner np = new Scanner(System.in);
		System.out.println("Give the Configration for the Apple Mac.");
		
		Laptop Apple;
		
		System.out.println("Give the Ram");
		int a1 = np.nextInt();
		System.out.println("Give the Rom");
		int b1 = np.nextInt();
		System.out.println("Give the Processor");
		String c1 = np.next();
		System.out.println("Give the Architectur");
		String d1 = np.next();
		Apple = new Laptop(a1,b1,c1,d1);
		
		Laptop vaio = new Laptop(6,"i3");
		
		System.out.println(Apple.Coding());
		
		System.out.println();
		
		System.out.println("for vaio");
		System.out.println(vaio.Coding());
	}

}


class ak{
	private int a;
	ak(int a){
		this.a = a;
	}
	
	int ret_a(int a) {
		
		return a;
	}
}

class bk extends ak{
	int b;
	
	bk(int a,int b){
		super(a);
		this.b = b;
	}
	
	int ret_a_b(int a, int b) {
		return a + b;
		
	}
}
public class Super_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bk b1 = new bk(5,7);
		System.out.println(b1.ret_a_b(5,7));
	}

}


class one_1{
	private String s;
	private char c;
	
	one_1(String s, char c){
		this.s = s;
		this.c = c;
	}
	
	String value(String s1, char c1) {
		return s1 + " -- "+c1;
	}
}

class two_2 extends one_1{
	String s2;
	
	two_2(String s2, String s,char c){
		super(s, c);
		this.s2 = s2;
		
	}
	
	String ret(String s2, String s, char c) {
		return s2 + " "+ s + " " + c;
	}
}
public class Inheritance_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two_2 tw = new two_2("Himalyan cool","LG",'$');
		System.out.println(tw.ret("Himalayan cool","LG" , '$'));
	}

}


		for(int i=0; i<8; i++) {
			for(int j=0; j<8;j++) {
				if(i+j ==  i-j) {
					System.out.print("~");
				}
				else if(i*j == i/j) {
					System.out.print("-");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}


	static int sum(int a1) {
		if(a1 == 4) {
			System.out.println("Price is 2000");
		}
		else if(a1 == 8) {
			System.out.println("Price is 4000");
		}
		else {
			System.out.println("Unknown Ram");
		}
		return a1;
		
	}

	static String sum(String c1) {
		if(c1.equals("i3")) {
			System.out.println("Price is 7000");
		}
		else if(c1.equals("i5")) {
			System.out.println("Price is 12000");
		}
		else {
			System.out.println("Unknown Processor");
		}
		return "Every Processor is best";
	}

interface Vehicle{
	void ChangeGear(int ak);
	void Speedup(int ak);
	void ApplyBrakes(int ak);
	void MusicSystem(boolean ek);
}

class Car implements Vehicle{
	int Speed;
	int Gear;
	boolean musicSystem;
	
	public void ChangeGear(int bk) {
		Gear = bk;
	}
	
	public void Speedup(int ck) {
		Speed = Speed + ck;
	}
	
	public void ApplyBrakes(int dk) {
		Speed = Speed - dk;
	}
	
	public void MusicSystem(boolean fk) {
		musicSystem = fk;
	}
	
	
	public void printStates() {
		System.out.println("Gear : "+ Gear+"\n"+"Speed : "+ Speed + "\n"+"Music System : "+musicSystem);
	}
}

class Bus implements Vehicle{
	int speed1;
	int gear1;
	boolean music;
	
	public void ChangeGear(int bk) {
		gear1 = bk;
	}
	
	public void Speedup(int ck) {
		speed1 = speed1 + ck;
	}
	
	public void ApplyBrakes(int dk) {
		speed1 = speed1 - dk;
	}
	
	public void MusicSystem(boolean fk) {
		music = fk;
	}
	
	
	public void printStates() {
		System.out.println("Gear : "+ gear1+"\n"+"Speed : "+ speed1 + "\n"+"Music System : "+music);
	}
}

public class Interface_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.ChangeGear(4);
		c1.Speedup(70);
		c1.ApplyBrakes(40);
		c1.MusicSystem(true);
		
		System.out.println("Car Status : ");
		c1.printStates();
		
		System.out.println();
		
		Car c2 = new Car();
		c2.ChangeGear(6);
		c2.Speedup(50);
		c2.ApplyBrakes(10);
		c1.MusicSystem(false);
		
		System.out.println("Bus Status : ");
		c2.printStates();

	}

}

interface Computer{
	void processor(String a);
	void ram1(int b);
}

class one implements Computer{
	String c;
	int ram;
	public void processor(String d) {
		c = d;
	}
	
	public void ram1(int e) {
		ram = e;
	}
	
	public void printStates() {
		System.out.println("Processor : "+c+"\n"+"Ram : "+ ram);
	}
}
public class Interface_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one Apple = new one();
		Apple.processor("i7");
		Apple.ram1(128);
		Apple.printStates();
	}

}


class two implements Computer{
	int ram2;
	public void ram1(int t) {
		ram2 = t;
	}
	public void printStates() {
		System.out.println("Ram : "+ram2);
	}
}

		two Asus = new two();
		Asus.ram1(512);
		Asus.printStates();

import java.util.*;
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		int a = np.nextInt();
		int b = np.nextInt();
		String d = np.next();
		char e1 = d.charAt(a);
		try {
			int c = a/b;
			int f = e1+'4';
		}
		catch(Exception e){
			System.out.println("It has errors");
			System.out.println(e);

			
		}
		System.out.println("program continued");
		
	}

}


import java.util.*;
public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		String a = np.nextLine();
		int b = (int) (Math.random()*10);
		System.out.println(b);
		
		try {
			char c = a.charAt(b);
			System.out.println(c);
			int d = Character.getNumericValue(c);
			int e = d/b;
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}

