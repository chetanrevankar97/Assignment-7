import java.util.*;
public class ReverseArray {
	
	static int[] arr;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of string array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr= new int[n];
		System.out.println("Enter elements of string array");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		ReverseArray s=new ReverseArray();
		s.reverse_array();
	}
	public void reverse_array() {
		// TODO Auto-generated method stub
		System.out.println("Array before reversing");
		int j=n;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		int reverse_arr[]=new int[n];
		for(int i=0;i<n;i++){
			reverse_arr[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Array after reversing");
		for(int i=0;i<n;i++){
			System.out.println(reverse_arr[i]);
		}
	}

}
