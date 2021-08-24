class Exerciseja{
    public static void main(String args[]){
        double a = 7;
        double b =4;

        System.out.println(a/b);
    }
}

import java.util.*;
public class ArrayInsertion_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos,i,size;
		String val;
		String[] arr = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = sc.nextInt();
		System.out.println("Enter the Values in Array");
		for(i = 0; i < size; i++) {
			arr[i] = sc.next();
		}
		for(i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Enter the position at which you want to Enter ");
		pos = sc.nextInt();
		System.out.println("Enter the Value you want to Add");
		val = sc.next();
		
		i = size - 1;
		while(i >= pos) {
			arr[i+1] = arr[i];
			i--;
		}
		
		arr[pos] = val;
		size = size + 1;
		
		System.out.println("Insertion of String succesfull");
		System.out.println("New Array (after insertion)");
		
		for(i = 0; i< size;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}


import java.util.*;
public class ArrayDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, size, pos,val;
		int[] arr1 = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		size = sc.nextInt();
		
		System.out.println("Enter the values for Array");
		for(i=0;i<size;i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(i=0;i<size;i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("Enter the position you want to delete from");
		pos = sc.nextInt();
		
		i = pos + 1;
		while(i <= size) {
			arr1[i-1] = arr1[i];
			i++;
		}
		size = size - 1;
		
		System.out.println("Deletion succesfull");
		System.out.println("New Array (after deletion)");
		
		for(i=0;i<size;i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}

import java.util.*;
public class PracticeSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner np = new Scanner(System.in);
		System.out.println("list the Marks in all the subjects ");
		double a = np.nextDouble();
		double b = np.nextDouble();
		double c = np.nextDouble();
		double d = np.nextDouble();
		double e = np.nextDouble();
		
		double result;
		
		result = (a+b+c+d+e)/500 * 100;
		System.out.println("RESULT : "+result+"%");
		
		System.out.println("CGPA : "+result*9.5/100);
		
		int ak;
		if(Math.floor(a)==a) {
			System.out.println(a + " is integer");
		}
		else {
			System.out.println("not a integer ");
		}
	}

}

import java.util.*;
public class PracticeSet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner np = new Scanner(System.in);
			System.out.println("Give me A String : ");
			String A = np.nextLine();
			
			//System.out.println("Give me A Char : ");
			//char b = np.next().charAt(0);
			
			for(int i = 0 ;i<A.length();i++) {
				if(A.charAt(i) == A.charAt(i)) {
					System.out.println(A.charAt(i) + " at "+i);
				}
			}
			
			char[] arr1 = new  char[5];
			for(int i=0;i<A.length();i++) {
				arr1[i] = A.charAt(i);
			}
			System.out.println();
			
			for(int i=0 ; i<arr1.length;i++) {
				System.out.println(arr1[i]);
			}
	}

}

public static int income(int ak) {
		if(ak < 520000) {
			System.out.println("You have to pay Zero tax on "+ak);
			return 0;
		}
		else if(ak>52000 & ak < 1000000) {
			System.out.println("You have to pay 20 percent tax on "+ak);
			return (ak*20/100);
		}
		else{
			System.out.println("You have to pay 30 percent tax on "+ak);
			return (ak*30/100);
		}

		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				if(i==0) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}



import java.util.*;
public class ArraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		System.out.println("Enter the Vales in the Array");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the Value which you want to search");
		int val = sc.nextInt();
		
		int i=0,count=0;
		while(i<size) {
			if(arr[i] == val) {
				count++;
			} 
			i++;
		}
		
		if(count == 0) {
			System.out.println("The value is not in the Array");
		}
		else {
			System.out.println("WE FOUND THE VALUE - " + val + " -> " +count + " TIMES");
		}
	}

}


import java.util.*;
public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of First Array");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of Second Array");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		System.out.println("Enter the values for First Array");
		for(int i=0;i<size1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the values for Second Array");
		for(int i=0;i<size2;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("First Array : ");
		for(int i=0;i<size1;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Second Array : ");
		for(int i=0;i<size2;i++) {
			System.out.print(arr2[i] + " ");
		}
		int[] arr3 = new int[arr1.length + arr2.length]; 
		for(int i=0,k=0;i<arr1.length;i++) {
			arr3[k] = arr1[i];
			k++;
		}
		for(int j=0,k=arr1.length;k<(arr1.length + arr2.length);k++) {
			arr3[k] = arr2[j];
			j++;
		}
		
		System.out.println();
		System.out.println("New Array (after merging)");
		for(int i=0;i<(arr1.length + arr2.length);i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}

import java.util.*;
public class ArraySortedMerging_UserIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of First Array");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of Second Array");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		System.out.println("Enter the values for First Array");
		for(int i=0;i<size1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the values for Second Array");
		for(int i=0;i<size2;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("First Array : ");
		for(int i=0;i<size1;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Second Array : ");
		for(int i=0;i<size2;i++) {
			System.out.print(arr2[i] + " ");
		}
		int[] arr3 = new int[arr1.length + arr2.length]; 
		int i=0,j=0,k=0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i < arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		System.out.println();
		System.out.println("Sorted Merged Arrary");
		for(int l=0;l<arr3.length;l++) {
			System.out.print(arr3[l] + " ");
		}
	}

}

import java.util.*;
public class ArrayBinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of Array (Ascending Order) ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("The Array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the value you want to search in the array");
		int val = sc.nextInt();
		int first = 0;
		int last = arr.length - 1;
		int count = 0;
		int mid = 0;
		while(first <= last) {
			mid = (first + last)/2;
			if(arr[mid] == val) {
				System.out.println("We found the number : "+val);
				count++;
				break;
			}
			if(arr[mid] > val) {
				last = mid - 1;
			}
			if(arr[mid] < val) {
				first = mid + 1;
			}
		}
		if(count == 0) {
			System.out.println(val + " is not in the Array");
		}
	}

}

