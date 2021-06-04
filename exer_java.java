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