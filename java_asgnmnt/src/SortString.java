import java.util.*;

public class SortString {
	static String arr[];
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of string array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr= new String[n];
		System.out.println("Enter elements of string array");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		
		SortString s=new SortString();
		s.sort_string();
	}
	
	public void sort_string(){
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

}