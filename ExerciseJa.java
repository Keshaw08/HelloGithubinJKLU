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

