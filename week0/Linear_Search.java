import java.util.*;
public class Linear_Search {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int ser=sc.nextInt();
		int found=0;
		for(i=0;i<n;i++) {
			if(ser==arr[i]) {
				found=1;
				System.out.println("The number is found");
				System.out.println("the number of comparisons are "+ (i+1));
				break;
				
			}
		}
		if(found==0)
			System.out.println("not found");
		
		
	}

}
