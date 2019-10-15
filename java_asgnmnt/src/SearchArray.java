import java.util.*;

public class SearchArray {

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
		
		SearchArray s=new SearchArray();
		s.search_array();
	}
	
	public void search_array(){
		int i;
		boolean flag=true;
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter element to be searched");
		String search=sc2.next();
		for(i=0;i<n;i++){
			if(arr[i].equals(search)){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Element not found");
		else
			System.out.println("Element found at position "+i);


	}
}
