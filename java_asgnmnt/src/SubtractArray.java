import java.util.*;
public class SubtractArray {
	
	static void Sub(int arr1[], int arr2[], int a, int b) 
	{ 
		for (int i = 0; i < a; i++) 
		{ 
			int j; 
			for (j = 0; j < b; j++) 
				if (arr1[i] == arr2[j]) 
					break; 
			if (j == b) 
				System.out.print(arr1[i] + " "); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		int arr1[] = { 2, 5, 9, 8, 3, 0 ,6}; 
		int arr2[] = { 2, 3, 5,8 ,6 }; 
		int x = arr1.length; 
		int y = arr2.length; 
		Sub(arr1, arr2, x, y); 
	} 
}
